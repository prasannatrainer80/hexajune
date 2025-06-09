package com.java.hib.main;

import java.util.List;

import com.java.hib.dao.EmployDao;
import com.java.hib.dao.EmployDaoImpl;

public class EmployShowNamesMain {
	public static void main(String[] args) {
		EmployDaoImpl employDao = new EmployDaoImpl();
		List<String> names = employDao.showEmployProjection();
		names.forEach(x -> {
			System.out.println(x);
		});
	}
}
