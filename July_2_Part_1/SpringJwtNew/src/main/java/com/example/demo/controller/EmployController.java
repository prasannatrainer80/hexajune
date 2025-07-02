package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.JwtService;
import com.example.demo.model.AuthRequest;
import com.example.demo.model.Employ;
import com.example.demo.service.EmployService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value="/employ")
public class EmployController {

	@Autowired
	private EmployService service;
	
	   @Autowired
	    private JwtService jwtService;
	
    @Autowired
    private AuthenticationManager authenticationManager;
	
    @CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value="/showEmploy")
	public List<Employ> showEmploy() {
		return service.showEmployDao();
	}
	
	@GetMapping(value="/searchEmploy/{id}")
	public Employ searchEmploy(@PathVariable int id) {
		return service.searchEmploy(id);
	}
	
	@PostMapping(value="/addEmploy")
	public String addEmploy(@RequestBody Employ employ) {
		return service.addEmployDao(employ);
	}
	
	@PutMapping(value="/updateEmploy")
	public String updateEmploy(@RequestBody Employ employ) {
		return service.updateEmployDao(employ);
	}
	
	@DeleteMapping(value="/deleteEmploy/{id}")
	public String deleteEmploy(@PathVariable int id) {
		return service.deleteEmployDao(id);
	}
	
	 @PostMapping("/generateToken")
	    public String authenticateAndGetToken(@RequestBody AuthRequest authRequest) {
	        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
	        if (authentication.isAuthenticated()) {
	            return jwtService.generateToken(authRequest.getUsername());
	        } else {
	            throw new UsernameNotFoundException("invalid user request !");
	        }
	    }
}
