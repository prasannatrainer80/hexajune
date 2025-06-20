package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/consumer")
public class TestController {

	@GetMapping(value="/lunch")
	public String lunch() {
		return "Lunch at 1 PM...";
	}
	
	@GetMapping(value="/company")
	public String company() {
		return "Company is Hexaware...";
	}
}
