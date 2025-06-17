package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(value="/showEmployee")
	public List<Employee> showEmployee() {
		return employeeService.showEmployee();
	}
	
	@GetMapping(value="/searchEmployee/{empId}")
	public Employee searchEmployee(@PathVariable int empId) {
		return employeeService.searchEmployee(empId);
	}
}
