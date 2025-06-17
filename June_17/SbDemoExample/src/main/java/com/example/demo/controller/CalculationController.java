package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationController {

	@GetMapping(value="/sum/{x}/{y}")
	public String sum(@PathVariable int x, @PathVariable int y) {
		int z = x + y;
		String res="";
		res+=z;
		return res;
	}
	
	@GetMapping(value="/sub/{x}/{y}")
	public String sub(@PathVariable int x, @PathVariable int y) {
		int z = x - y;
		String res="";
		res+=z;
		return res;
	}
	
	@GetMapping(value="/mult/{x}/{y}")
	public String mult(@PathVariable int x, @PathVariable int y) {
		int z = x * y;
		String res="";
		res+=z;
		return res;
	}
}
