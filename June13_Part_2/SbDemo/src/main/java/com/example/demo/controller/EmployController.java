package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employ;
import com.example.demo.service.EmployService;

@RestController
public class EmployController {

	@Autowired
	private EmployService employService;
	
	@GetMapping(value="/showEmploy")
	public List<Employ> showEmploy() {
		return employService.showEmploy();
	}
	
	@GetMapping(value="/searchEmploy/{empno}")
	public Employ searchEmploy(@PathVariable int empno) {
		return employService.searchEmploy(empno);
	}
}
