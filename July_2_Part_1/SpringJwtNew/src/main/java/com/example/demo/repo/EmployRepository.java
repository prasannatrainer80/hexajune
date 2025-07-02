package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employ;

@Repository
public interface EmployRepository extends JpaRepository<Employ, Integer> {
	Optional<Employ> findByName(String username);
}
