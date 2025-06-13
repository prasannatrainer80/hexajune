package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HelloController {

	@RequestMapping(value="/")
	public String sayHello() {
		return "Welcome to Spring Boot...Default Method...";
	}
	
	@RequestMapping(value="/company")
	public String company() {
		return "From Hexaware Thank you All...";
	}
	
	@RequestMapping(value="/greeting/{name}")
	public String greetMe(@PathVariable String name) {
		return "Welcome to " +name;
	}
	
	@RequestMapping(value="/show/{firstName}/{lastName}")
	public String show(@PathVariable String firstName, 
			@PathVariable String lastName
			) {
		String fullName = firstName + " " +lastName;
		return fullName;
	}
}
