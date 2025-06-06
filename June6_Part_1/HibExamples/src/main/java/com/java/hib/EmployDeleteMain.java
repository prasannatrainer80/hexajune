package com.java.hib;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class EmployDeleteMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ Number  ");
		int empno = sc.nextInt();
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Query query = session.createQuery("from Employ where empno = " + empno);
		Employ employ =(Employ)query.uniqueResult();
		Transaction trans = session.beginTransaction();
		session.delete(employ);
		trans.commit();
		System.out.println("*** Employ Record Deleted ***");
	}
}
