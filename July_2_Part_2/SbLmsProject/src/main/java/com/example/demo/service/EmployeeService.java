package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> showEmployee() {
		return employeeRepository.findAll();
	}
	
	public Employee searchEmployee(int empNo) {
		return employeeRepository.findById(empNo).get();
	}
}
