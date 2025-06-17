package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value="/hello")
	public String sayHello() {
		return "Welcome to Spring Boot Application...";
	}
	
	@GetMapping(value="/greet/{name}")
	public String greetMe(@PathVariable String name) {
		return "Good Mornining..." +name;
	}
}
