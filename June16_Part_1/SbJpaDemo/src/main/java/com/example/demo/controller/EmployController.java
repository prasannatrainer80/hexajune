package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employ;
import com.example.demo.service.EmployService;

@RestController
public class EmployController {

	@Autowired
	private EmployService employService;
	
	@DeleteMapping(value="/deleteEmploy/{empno}")
	public String deleteEmploy(@PathVariable int empno) {
		return employService.deleteEmploy(empno);
	}
	
	@PostMapping(value="/addEmploy")
	public String addEmploy(@RequestBody Employ employ) {
		return employService.addEmploy(employ);
	}
	
	@PutMapping(value="/updateEmploy")
	public String updateEmploy(@RequestBody Employ employ) {
		return employService.updateEmploy(employ);
	}
	
	@GetMapping(value="/showEmploy")
	public List<Employ> showEmploy() {
		return employService.showEmploy();
	}
	
	@GetMapping(value="/searchEmploy/{empno}")
	public Employ searchById(@PathVariable int empno) {
		return employService.searchEmploy(empno);
	}
}
