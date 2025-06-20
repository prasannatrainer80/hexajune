package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserData;
import com.example.demo.repo.UserDataRepository;


@Service
public class UserDataService implements UserDetailsService {

	@Autowired
	private PasswordEncoder encoder;
	
	@Autowired
	private UserDataRepository userDataRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		  Optional<UserData> userDetail = userDataRepository.findByName(username);

	        // Converting userDetail to UserDetails
	        return userDetail.map(UserDataDetails::new)
	                .orElseThrow(() -> new UsernameNotFoundException("User not found " + username));
	}
	
	public String addUser(UserData userData) {
		userData.setPassword(encoder.encode(userData.getPassword()));
		userDataRepository.save(userData);
		return "User Added Successfully...";
	}

}
