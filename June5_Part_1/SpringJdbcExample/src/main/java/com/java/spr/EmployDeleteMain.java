package com.java.spr;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployDeleteMain {
	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ Number  ");
		empno = sc.nextInt();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spr/jdbc.xml");
		EmployDaoImpl dao = (EmployDaoImpl)ctx.getBean("employDaoImpl");
		System.out.println(dao.deleteEmployDao(empno));
	}
}
