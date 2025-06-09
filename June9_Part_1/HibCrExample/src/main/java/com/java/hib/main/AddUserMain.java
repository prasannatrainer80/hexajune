package com.java.hib.main;

import java.util.Scanner;

import com.java.hib.dao.EmployDao;
import com.java.hib.dao.EmployDaoImpl;
import com.java.hib.model.Login;

public class AddUserMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Login login = new Login();
		System.out.println("Enter User Name ");
		login.setUserName(sc.next());
		System.out.println("Enter Password  ");
		login.setPassCode(sc.next());
		EmployDao employDao = new EmployDaoImpl();
		System.out.println(employDao.addUser(login));
	}
}
