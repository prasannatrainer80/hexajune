package com.java.hib;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class MainProg {

	public static void main(String[] args) {

		Course c1 = new Course();
		c1.setCourseName("Core Java");
		c1.setInstructor("Prasanna");
		c1.setCourseFee(9992);
		
		Course c2 = new Course();
		c1.setCourseName("Advance Java");
		c1.setInstructor("Shalini");
		c1.setCourseFee(8822);
		
		Course c3 = new Course();
		c3.setCourseName("Java FSD");
		c3.setInstructor("Prasanna");
		c3.setCourseFee(19992);
		
		List<Course> list1 = new ArrayList<Course>();
		list1.add(c1);
		list1.add(c2);
		list1.add(c3);
		
		Student student1 = new Student();
		student1.setStudentName("Suryan");
		student1.setQualification("B.Tech");
		student1.setCourseList(list1);

		Course c4 = new Course();
		c4.setCourseName("Dotnet Core");
		c4.setInstructor("Prasanna");
		c4.setCourseFee(9992);
		
		Course c5 = new Course();
		c5.setCourseName("Dotnet FSE");
		c5.setInstructor("Naresh");
		c5.setCourseFee(38822);
		
		List<Course> list2 = new ArrayList<Course>();
		list2.add(c4);
		list2.add(c5);
		
		Student student2 = new Student();
		student2.setStudentName("Induja");
		student2.setQualification("B.Tech");
		student2.setCourseList(list2);

		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.save(student1);
		session.save(student2);
		trans.commit();
		System.out.println("Student Records Stored...");
	}
}
