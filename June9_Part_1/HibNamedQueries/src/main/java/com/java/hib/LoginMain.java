package com.java.hib;

import java.util.Scanner;

import com.java.hib.dao.EmployDao;
import com.java.hib.dao.EmployDaoImpl;
import com.java.hib.model.Login;

public class LoginMain {
	public static void main(String[] args) {
		Login login = new Login();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName  ");
		login.setUserName(sc.next());
		System.out.println("Enter Password  ");
		login.setPassCode(sc.next());
		EmployDao employDao = new EmployDaoImpl();
		int count = employDao.validate(login);
		if (count == 1) {
			System.out.println("Correct Credentials...");
		} else {
			System.out.println("Invalid Credentails...");
		}
	}
}
