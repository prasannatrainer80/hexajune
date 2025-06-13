package com.java.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/training/aop.xml");
		JavaFsdTraining javaFsd = (JavaFsdTraining) ctx.getBean("beanJavaFsd");
		javaFsd.showInfo("batch1");
		System.out.println("----------------------------------");
		javaFsd.location();
	}
}
