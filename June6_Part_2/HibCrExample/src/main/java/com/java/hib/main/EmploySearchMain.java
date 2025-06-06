package com.java.hib.main;

import java.util.Scanner;

import com.java.hib.dao.EmployDaoImpl;
import com.java.hib.model.Employ;

public class EmploySearchMain {
	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ Number  ");
		empno = sc.nextInt();
		Employ employFound = new EmployDaoImpl().searchEmployDao(empno);
		if (employFound != null) {
			System.out.println(employFound);
		} else {
			System.out.println("*** Record Not Found ***");
		}
	}
}
