package com.example.demo.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.model.LeaveHistory;
import com.example.demo.model.LeaveStatus;
import com.example.demo.repo.EmployeeRepository;
import com.example.demo.repo.LeaveHistoryRepository;

@Service
public class LeaveHistoryService {

	@Autowired
	private LeaveHistoryRepository leaveHistoryRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public String applyLeave(LeaveHistory leaveHistory) {
		
		Employee employee = employeeRepository.findById(leaveHistory.getEmpId()).get();
		int leaveBalance = employee.getEmpAvailLeaveBal();
		Date today = new Date();
		java.util.Date d1 = new Date(leaveHistory.getLeaveStartDate().getTime());
		long diff = d1.getTime() - today.getTime();
		diff = (diff/ (1000 * 60 * 60 * 24));
		System.out.println("Diff  " +diff);
		
		java.util.Date d2 = new Date(leaveHistory.getLeaveEndDate().getTime());
		long diff2 = d2.getTime() - today.getTime();
		diff2 = (diff2/ (1000 * 60 * 60 * 24));
		
		long diff3 = d2.getTime() - d1.getTime();
		diff3 = (diff3 / (1000 * 60 * 60 * 24));
		diff3++;
		
		int bal = (int)diff3;
		
		if (diff <= 0) {
			return "Leave-Start Date Cannot be YesterDay...";
		} else if (diff2 <= 0) {
			return "Leave-End Date Cannot Be YesterDay...";
		} else if (diff3 < 0) {
			return "Leave-StartDate Cannot be Greater than LeaveEndDate...";
		} else if (leaveBalance-diff3 < 0) {
			return "Insufficient Leave Balance...";
		}else {
			
			String cmd = "Update EMPLOYEE SET EMP_AVAIL_LEAVE_BAL = EMP_AVAIL_LEAVE_BAL - ? "
					+ " WHERE EMP_ID = ?";
			jdbcTemplate.update(cmd, new Object[] {diff3, leaveHistory.getEmpId()});
			
			leaveHistory.setLeaveNoOfDays(bal);
			leaveHistory.setLeaveStatus(LeaveStatus.PENDING);
			leaveHistoryRepository.save(leaveHistory);
		}		
		return "Leave Applied Successfully...";
	}
}
