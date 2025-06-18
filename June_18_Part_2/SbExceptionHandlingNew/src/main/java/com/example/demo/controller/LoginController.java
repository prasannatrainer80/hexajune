package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Login;
import com.example.demo.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@GetMapping(value="/login/{username}/{passcode}")
	public String login(@PathVariable String username, @PathVariable String passcode) {
		return loginService.login(username, passcode);
	}
	
	@PostMapping(value="/addLogin")
	public String addLogin(@RequestBody Login login) {
		return loginService.addLogin(login);
	}
}
