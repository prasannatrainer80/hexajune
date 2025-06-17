package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Login;
import com.example.demo.repo.LoginRepository;

@Service
public class LoginService {

	@Autowired
	private LoginRepository loginRepository;
	
	public String login(String username, String password) {
		Login login = loginRepository.findByUsernameAndPasscode(username, password);
		if (login !=null) {
			return "1";
		}
		return "0";
	}
	
	public String addLogin(Login login) {
		loginRepository.save(login);
		return "Login Created...";
	}
}
