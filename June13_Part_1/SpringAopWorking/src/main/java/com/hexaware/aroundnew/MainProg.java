package com.hexaware.aroundnew;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/hexaware/aroundnew/aop.xml");
		SegueTraining training = (SegueTraining)ctx.getBean("beanSegue");
		training.showInfo("Batch2");
		System.out.println("---------------------------------------");
		training.location();
	}
}
