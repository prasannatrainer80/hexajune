package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.WalSource;
import com.example.demo.model.Wallet;
import com.example.demo.repo.WalletRepository;

@Service
public class WalletService {

	@Autowired
	private WalletRepository walletRepository;
	
	public List<Wallet> showCustomerWallet(int custId) {
		return walletRepository.findByCusId(custId);
	}
	
	public ResponseEntity<Wallet> showCustomerWalletInfo(int custId, WalSource walSource) {
		Wallet wallet = walletRepository.findByCusIdAndWalSource(custId, walSource);
		if (wallet != null) {
			 return new ResponseEntity<>(wallet, HttpStatus.OK);
		}
		else {
			throw new ResourceNotFoundException("No Data Found with Data Entered ");
		}
	}
	
	public ResponseEntity<Wallet> searchByWalletId(int walletId) {
		 Wallet wallet = walletRepository.findById(walletId)
			        .orElseThrow(() -> new ResourceNotFoundException("Wallet with Id = " + walletId + " Not Exist in Db"));

			    return new ResponseEntity<>(wallet, HttpStatus.OK);
	}
}
