package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Vendor;
import com.example.demo.repo.VendorRepository;

@Service
public class VendorService {

	@Autowired
	private VendorRepository vendorRepository;
	
	public List<Vendor> showVendor() {
		return vendorRepository.findAll();
	}
	
	public Vendor searchVendor(int vid) {
		return vendorRepository.findById(vid).get();
	}
}
