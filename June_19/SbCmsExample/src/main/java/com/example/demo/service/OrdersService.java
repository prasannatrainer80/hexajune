package com.example.demo.service;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.controller.MenuController;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Menu;
import com.example.demo.model.OrderStatus;
import com.example.demo.model.Orders;
import com.example.demo.model.WalSource;
import com.example.demo.model.Wallet;
import com.example.demo.repo.OrdersRepository;

@Service
public class OrdersService {

    private final MenuController menuController;

	@Autowired
	private OrdersRepository ordersRepository;
	
	@Autowired
	private MenuService menuService;
	
	@Autowired
	private WalletService walletService;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

    OrdersService(MenuController menuController) {
        this.menuController = menuController;
    }
	
	public List<Orders> showCustomerOrders(int custId) {
		return ordersRepository.findByCusId(custId);
	}
	
	public List<Orders> showCustomerPendingOrders(int custId) {
		List<Orders> ordersList = ordersRepository.findByCusId(custId);
		Stream<Orders> streams= ordersList.stream().filter(x -> x.getOrdStatus().toString().equals("PENDING"));
		List<Orders> result = streams.collect(Collectors.toList());
		return result;
	}
	
	public ResponseEntity<Orders> searchByOrderId(int orderId) {
		Orders orders = ordersRepository.findById(orderId).orElseThrow(
				() -> new ResourceNotFoundException("Order with Id " +orderId + " Not Found")
				);

			    return new ResponseEntity<>(orders, HttpStatus.OK);
	}
	
	public String placeOrder(Orders orders) {
		ResponseEntity<Wallet> wallet = walletService.showCustomerWalletInfo(orders.getCusId(), 
				WalSource.valueOf(orders.getWalSource()));
		Wallet walletFound = wallet.getBody();
		double balance = walletFound.getWalAmount();
		
		ResponseEntity<com.example.demo.model.Menu> menu = menuService.searchByMenuId(orders.getMenId());
		Menu menuFound = menu.getBody();
		double price = menuFound.getMenPrice();
		double billAmount = orders.getOrdQuantity() * price;
		if (billAmount > balance) {
			return "Insufficient Funds...";
		}
		orders.setOrdBillamount(billAmount);
		orders.setOrdStatus(OrderStatus.PENDING);
		ordersRepository.save(orders);
		
		double bal = balance - billAmount;
		
		String cmd = "Update Wallet set Wal_Amount = ? Where CUS_ID = ? AND WAL_SOURCE = ?";
		jdbcTemplate.update(cmd, new Object[] {bal,orders.getCusId(),orders.getWalSource()});
		return "Order Placed Successfully...Balance Updated";
	}
}
