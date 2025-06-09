package com.java.hib;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class MainProg {
	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Address address = new Address();
		address.setCity("Hyderabad");
		address.setState("TS");
		
		Employee employee = new Employee();
		employee.setEmployeeId(100);
		employee.setName("Prasanna");
		employee.setAddress(address);
		
		Transaction trans = session.beginTransaction();
		session.save(employee);
		trans.commit();
		System.out.println("Tables Created...");
	}
}
