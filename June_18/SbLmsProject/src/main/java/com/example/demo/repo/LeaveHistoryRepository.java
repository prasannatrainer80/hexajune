package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.LeaveHistory;

@Repository
public interface LeaveHistoryRepository extends JpaRepository<LeaveHistory, Integer> {
	List<LeaveHistory> findByEmpId(int empId);
	LeaveHistory findByLeaveId(int leaveId);
}
