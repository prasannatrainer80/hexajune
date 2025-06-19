package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Orders;
import com.example.demo.service.OrdersService;

@RestController
public class OrdersController {

	@Autowired
	private OrdersService ordersService;
	
	@PostMapping(value="/placeOrder")
	public String placeOrder(@RequestBody Orders orders) {
		return ordersService.placeOrder(orders);
	}
	
	@GetMapping(value="/showCustomerOrders/{custId}")
	public List<Orders> showCustomerOrders(@PathVariable int custId) {
		return ordersService.showCustomerOrders(custId);
	}
	
	@GetMapping(value="/showCustomerPendingOrders/{custId}")
	public List<Orders> showCustomerPendingOrders(@PathVariable int custId) {
		return ordersService.showCustomerPendingOrders(custId);
	}
	
	@GetMapping(value="/searchByOrderId/{orderId}")
	public ResponseEntity<Orders> searchByOrderId(@PathVariable int orderId) {
		return ordersService.searchByOrderId(orderId);
	}
}
