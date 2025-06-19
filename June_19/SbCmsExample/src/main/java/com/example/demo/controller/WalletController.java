package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.WalSource;
import com.example.demo.model.Wallet;
import com.example.demo.service.WalletService;

@RestController
public class WalletController {

	@Autowired
	private WalletService walletService;
	
	@GetMapping(value="/showCustomerWalletInfo/{custId}/{walSource}")
	public ResponseEntity<Wallet> showInfo(@PathVariable int custId, 
				@PathVariable WalSource walSource
			) {
		return walletService.showCustomerWalletInfo(custId, walSource);
	}
	
	@GetMapping(value="/showWalletById/{walletId}")
	public ResponseEntity<Wallet> showWalletInfo(@PathVariable int walletId) {
		return walletService.searchByWalletId(walletId);
	}
	
	@GetMapping(value="/showCustomerWallets/{custId}")
	public List<Wallet> showCustomerWallet(@PathVariable int custId) {
		return walletService.showCustomerWallet(custId);
	}
}
