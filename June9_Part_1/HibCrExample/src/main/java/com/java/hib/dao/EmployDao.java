package com.java.hib.dao;

import java.util.List;

import com.java.hib.model.Employ;
import com.java.hib.model.Login;

public interface EmployDao {
	List<Employ> showEmployDao();
	Employ searchEmployDao(int empno);
	String addUser(Login login);
	Long authenticate(Login login);
}
