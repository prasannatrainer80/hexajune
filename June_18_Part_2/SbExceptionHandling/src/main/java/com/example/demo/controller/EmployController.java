package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.InternalServerErrorException;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Employ;
import com.example.demo.repo.EmployRepository;
import com.example.demo.service.EmployService;

@RestController
public class EmployController {

	@Autowired
	private EmployRepository employRepository;
	
	@Autowired
	private EmployService employService;
	
	@GetMapping(value="/showEmploy")
	public List<Employ> showEmploy() {
		return employService.showEmploy();
	}
	
	@GetMapping(value="/searchEmploy/{empno}")
	public ResponseEntity<Employ> searchById(@PathVariable int empno) {
		 Employ employ = employRepository.findById(empno)
			        .orElseThrow(() -> new ResourceNotFoundException("Not found Tutorial with id = " + empno));

			    return new ResponseEntity<>(employ, HttpStatus.OK);
	}
	
//	@GetMapping(value="/searchEmploy/{empno}")
//	public Employ searchEmploy(@PathVariable int empno) {
//		return employService.searchEmploy(empno);
//	}
	
	@GetMapping(value="/showByDeptAndGender/{dept}/{gender}")
	public List<Employ> showByDeptAndGender(@PathVariable String dept, 
			@PathVariable String gender
			) {
		return employService.showDeptGenderWise(dept, gender);
	}
	
	@GetMapping(value="/showByDept/{dept}")
	public List<Employ> showByDept(@PathVariable String dept) {
		return employService.showDeptWise(dept);
	}
	
	@PostMapping(value="/addEmploy")
	public String addEmploy(@RequestBody Employ employ) {
		int empId = employ.getEmpno();
		Employ employFound = employRepository.findById(empId).orElse(null);
		if (employFound !=null) {
			throw new InternalServerErrorException("Employ Record Exists with Id " +empId);
		} else {
			employRepository.save(employ);
			return "Employ Record Added...";
		}
	}

	
//	@PostMapping(value="/addEmploy")
//	public String addEmploy(@RequestBody Employ employ) {
//		return employService.addEmploy(employ);
//	}
	
	@PutMapping(value="/updateEmploy")
	public String updateEmploy(@RequestBody Employ employ) {
		return employService.updateEmploy(employ);
	}
	
	@DeleteMapping(value="/deleteEmploy/{id}")
	public String deleteEmploy(@PathVariable int id) {
		return employService.deleteEmploy(id);
	}
}
