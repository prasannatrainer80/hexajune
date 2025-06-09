package com.java.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class MainProg {
	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Project project = new Project();
		project.setProjectName("Insurance Model");
		project.setClient("CitiBank");
		Trainee trainee = new Trainee();
		trainee.setTraineeName("Varsha");
		trainee.setQualification("B.Tech");
		trainee.setProject(project);
		Transaction trans = session.beginTransaction();
		session.save(trainee);
		trans.commit();
		System.out.println("*** Tables Created with Data ***");
	}
}
