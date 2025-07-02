package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.config.EmployDetails;
import com.example.demo.model.Employ;
import com.example.demo.repo.EmployRepository;

@Service
public class EmployService implements UserDetailsService {

	@Autowired
	private EmployRepository repo;
	
	
	@Autowired
	private PasswordEncoder encoder;
	
	public List<Employ> showEmployDao() {
		return repo.findAll();
	}
	
	public Employ searchEmploy(int empno) {
		return repo.findById(empno).get();
	}
	
	public String addEmployDao(Employ employ) {
		employ.setPassword(encoder.encode(employ.getPassword()));
		repo.save(employ);
		return "Employ Record Inserted...";
	}
	
	public String deleteEmployDao(int id) {
		Employ employ = repo.findById(id).get();
		repo.delete(employ);
		return "Employ Record Deleted...";
	}
	public String updateEmployDao(Employ employ) {
		employ.setPassword(encoder.encode(employ.getPassword()));
		repo.save(employ);
		return "Employ Record Deleted...";
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		  Optional<Employ> userDetail = repo.findByName(username);

	        // Converting userDetail to EmployDetails
	        return userDetail.map(EmployDetails::new)
	                .orElseThrow(() -> new UsernameNotFoundException("User not found " + username));
	}
	
	
}
