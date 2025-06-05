package com.java.spr;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Vendor {

	private int vid;
	private String vendorName;
	private List<Customer> customers;
	
	public void showInfo() {
		System.out.println("Vendor Id  " +vid + " Vendor Name " +vendorName);
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}
}
