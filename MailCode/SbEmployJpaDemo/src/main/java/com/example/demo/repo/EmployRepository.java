package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employ;

@Repository
public interface EmployRepository extends JpaRepository<Employ, Integer> {
	List<Employ> findByDept(String dept);
	List<Employ> findByDeptAndGender(String dept, String gender);
}
