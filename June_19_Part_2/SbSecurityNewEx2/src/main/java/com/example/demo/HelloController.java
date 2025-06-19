package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/delete")
	public String delete() {
		return "This is Delete Request only Admins can do this...";
	}
	
	@GetMapping(value="/greeting")
	public String greeting() {
		return "This is Free Method anyone can access...";
	}
	
	@GetMapping(value="/mcq")
	public String mcq() {
		return "This is MCQ Method only students can access...";
	}
}
