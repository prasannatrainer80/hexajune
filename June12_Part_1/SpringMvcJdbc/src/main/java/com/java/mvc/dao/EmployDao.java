package com.java.mvc.dao;

import java.util.List;

import com.java.mvc.model.Employ;

public interface EmployDao {
	List<Employ> showEmployDao();
	Employ searchEmployDao(int empno);
	String updateEmployDao(Employ employUpdated);
	String deleteEmployDao(int empno);
	String addEmployDao(Employ employNew);
}
