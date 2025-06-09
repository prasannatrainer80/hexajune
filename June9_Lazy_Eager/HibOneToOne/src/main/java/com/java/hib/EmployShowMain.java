package com.java.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class EmployShowMain {
	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Query query = session.createQuery("from Employee");
		List<Employee> employeeList = query.list();
		for (Employee emp : employeeList) {
			System.out.println(emp.getEmpId() + " " +emp.getName() + " ");
			System.out.println(emp.getAddress().getAddressId());
			System.out.println(emp.getAddress().getCity());
			System.out.println(emp.getAddress().getState());
		}
	}
}
