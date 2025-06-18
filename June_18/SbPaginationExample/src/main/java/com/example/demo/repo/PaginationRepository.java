package com.example.demo.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employ;

@Repository
public interface PaginationRepository extends PagingAndSortingRepository<Employ, Integer> {

}
