package com.java.rest.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.rest.model.Employ;

public interface EmployDao {
	List<Employ> showEmployDao() throws SQLException;
	Employ searchEmployDao(int empno) throws SQLException;
	String addEmployDao(Employ employ) throws SQLException;
}
