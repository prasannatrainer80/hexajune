package com.hexaware.prod;

import java.util.List;

public class OrderLogic {

	private List<Order> items;

	public List<Order> getItems() {
		return items;
	}

	public void setItems(List<Order> items) {
		this.items = items;
	}

	public void displayInfo() {
		for (Order order : items) {
			System.out.println(order);
			int diff = order.getQtyOrd() - order.getProduct().getQuantityAvail();
			if (diff > 0) {
				System.out.println("Insufficient Quantity...");
			} else {
				System.out.println("Total Bill Amount  " +order.getProduct().getPrice() * order.getQtyOrd());
			}
		}
	}

}
