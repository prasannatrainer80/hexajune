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
	
	@GetMapping(value="/showVendor")
	public List<Vendor> showVendor() {
		return vendorService.showVendor();
	}
	
	@GetMapping(value="/searchVendor/{id}")
	public Vendor searchVendor(@PathVariable int id) {
		return vendorService.searchVendor(id);
	}
}
