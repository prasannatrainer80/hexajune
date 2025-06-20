package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value="/employee")
@RestController
public class TestController {

	@GetMapping(value="/greeting")
	public String sayHello() {
		return "Welcome to API Gateway Service1...";
	}
	
	@GetMapping(value="/topic")
	public String service() {
		return "API Service Calling Example...";
	}
	
}
