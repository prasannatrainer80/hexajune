package com.java.hib;

import java.util.List;
import java.util.Scanner;

import com.java.hib.dao.EmployDao;
import com.java.hib.dao.EmployDaoImpl;
import com.java.hib.model.Employ;

public class EmploySearchMain {
	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ Number  ");
		empno = sc.nextInt();
		EmployDao employDao = new EmployDaoImpl();
		Employ employFound = employDao.searchEmployDao(empno);
		if (employFound != null) {
			System.out.println(employFound);
		} else {
			System.out.println("*** Record Not Found ***");
		}
	}
}
