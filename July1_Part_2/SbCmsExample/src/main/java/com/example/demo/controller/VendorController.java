package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Vendor;
import com.example.demo.service.VendorService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class VendorController {

	@Autowired
	private VendorService vendorService;
	
	@GetMapping(value="/vendorUserName/{userName}")
	public Vendor searchByUserName(@PathVariable String userName) {
		return vendorService.searchByUserName(userName);
	}
	
	@GetMapping(value="/showVendor")
	public List<Vendor> showVendor() {
		return vendorService.showVendor();
	}
	
	@GetMapping(value="/vendorLogin/{user}/{pwd}")
	public String vendorLogin(@PathVariable String user, @PathVariable String pwd) {
		return vendorService.vendorLogin(user, pwd);
	}
	
	@GetMapping(value="/searchVendor/{id}")
	public Vendor searchVendor(@PathVariable int id) {
		return vendorService.searchVendor(id);
	}
}
