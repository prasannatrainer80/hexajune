package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Customer;
import com.example.demo.repo.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> showCustomer() {
		return customerRepository.findAll();
	}
	
	public ResponseEntity<Customer> searchByCustomerUserName(String userName) {
		 Customer customer = customerRepository.findByCusUsername(userName);
		  if (customer !=null) {
			    return new ResponseEntity<>(customer, HttpStatus.OK);
		  }
		  else {
			  throw new ResourceNotFoundException("No Data Found with User " +userName);
		  }
	}

	public int authentication(String user, String password) {
		Customer customerFound = customerRepository.findByCusUsernameAndCusPassword(user, password);
		if (customerFound != null) {
			return 1;
		}
		return 0;
	}
	
	public ResponseEntity<Customer> searchByCustomerId(int custId) {
		 Customer customer = customerRepository.findById(custId)
			        .orElseThrow(() -> new ResourceNotFoundException("Customer with Id = " + custId + " Not Exist in Db"));

			    return new ResponseEntity<>(customer, HttpStatus.OK);
	}
}
