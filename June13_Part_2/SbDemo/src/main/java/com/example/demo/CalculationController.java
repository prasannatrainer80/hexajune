package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationController {
	
	@RequestMapping(value="/sum/{firstNo}/{secondNo}")
	public String sum(@PathVariable int firstNo, @PathVariable int secondNo) {
		int result = firstNo + secondNo;
		String res = "";
		res+=result;
		return res;
	}
	
	@RequestMapping(value="/sub/{firstNo}/{secondNo}")
	public String sub(@PathVariable int firstNo, @PathVariable int secondNo) {
		int result = firstNo - secondNo;
		String res = "";
		res+=result;
		return res;
	}
	
	@RequestMapping(value="/mult/{firstNo}/{secondNo}")
	public String mult(@PathVariable int firstNo, @PathVariable int secondNo) {
		int result = firstNo * secondNo;
		String res = "";
		res+=result;
		return res;
	}
	
	
}
