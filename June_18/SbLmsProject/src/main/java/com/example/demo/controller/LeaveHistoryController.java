package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LeaveHistory;
import com.example.demo.service.LeaveHistoryService;

@RestController
public class LeaveHistoryController {

	@Autowired
	private LeaveHistoryService leaveHistoryService;
	
	@PostMapping(value="/approveDeny/{leaveId}/{managerId}/{status}/{managerComments}")
	public String approveDeny(@PathVariable int leaveId, @PathVariable int managerId, 
			@PathVariable String status, @PathVariable String managerComments
			) {
		return leaveHistoryService.approveDeny(leaveId, managerId, status, managerComments);
	}
	
	@GetMapping(value="/searchByLeaveId/{leaveId}")
	public LeaveHistory searchByLeaveId(@PathVariable int leaveId) {
		return leaveHistoryService.searchByLeaveId(leaveId);
	}
	
	@PostMapping(value="/applyLeave")
	public String applyLeave(@RequestBody LeaveHistory leaveHistory) {
		return leaveHistoryService.applyLeave(leaveHistory);
	}
	
	@GetMapping(value="/employeeLeaveHistory/{empId}")
	public List<LeaveHistory> showEmployeeLeaveHistory(@PathVariable int empId) {
		return leaveHistoryService.showEmployeeLeaveHistory(empId);
	}
}
