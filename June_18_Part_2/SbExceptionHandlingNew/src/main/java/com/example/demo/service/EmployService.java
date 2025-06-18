package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employ;
import com.example.demo.repo.EmployRepository;

@Service
public class EmployService {

	@Autowired
	private EmployRepository employRepository;
	
	
	public String deleteEmploy(int empno) {
		Employ employ = searchEmploy(empno);
		employRepository.delete(employ);
		return "Employ Record Deleted...";
	}
	
	public String updateEmploy(Employ employ) {
		employRepository.save(employ);
		return "Employ Record Updated...";
	}
	
	public String addEmploy(Employ employ) {
		employRepository.save(employ);
		return "Employ Record Inserted...";
	}
	
	public List<Employ> showEmploy() {
		return employRepository.findAll();
	}
	
	public Employ searchEmploy(int empno) {
		return employRepository.findById(empno).get();
	}
}
