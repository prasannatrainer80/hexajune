package com.java.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class MainProgram {
	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sf.openSession();
		 Address addr = new Address();
         addr.setCity("Chennai");
         addr.setState("Tamil Nadu");

         Employee emp = new Employee();
         emp.setName("Prasanna");
         emp.setAddress(addr);

         session.beginTransaction();
         session.save(emp);
         session.getTransaction().commit();

         System.out.println("Employee saved!");
	}
}
