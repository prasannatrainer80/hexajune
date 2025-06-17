package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LeaveHistory;
import com.example.demo.service.LeaveHistoryService;

@RestController
public class LeaveHistoryController {

	@Autowired
	private LeaveHistoryService leaveHistoryService;
	
	@PostMapping(value="/applyLeave")
	public String applyLeave(@RequestBody LeaveHistory leaveHistory) {
		return leaveHistoryService.applyLeave(leaveHistory);
	}
}
