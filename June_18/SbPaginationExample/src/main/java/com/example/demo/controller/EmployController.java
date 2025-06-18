package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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
	private EmployService service;

	@GetMapping(value="/show/{start}/{end}/{sort}")
	public ResponseEntity<List<Employ>> getEmploys(@PathVariable int start,
			@PathVariable int end, @PathVariable String sort
			) {
		List<Employ> list = service.getAllEmploys(start, end, sort);
		return new ResponseEntity<List<Employ>>(list,new HttpHeaders(), HttpStatus.OK);
		
	}
}
