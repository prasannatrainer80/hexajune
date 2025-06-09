package com.java.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class MainShow {

	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		Query query = session.createQuery("from Question");
		List<Question> questionList = query.list();
		for (Question question : questionList) {
			System.out.println(question.getQid());
			System.out.println(question.getQname());
			List<Answer> answers = question.getAnswers();
			for(Answer ans : answers) {
				System.out.println(ans.getId());
				System.out.println(ans.getAnswername());
				System.out.println(ans.getPostedBy());
			}
		}
	}
}
