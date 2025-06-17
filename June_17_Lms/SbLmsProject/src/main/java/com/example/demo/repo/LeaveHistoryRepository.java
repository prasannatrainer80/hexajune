package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.LeaveHistory;

@Repository
public interface LeaveHistoryRepository extends JpaRepository<LeaveHistory, Integer> {

}
