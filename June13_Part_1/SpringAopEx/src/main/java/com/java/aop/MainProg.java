package com.java.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/aop/aop.xml");
		Boarding boarding = (Boarding)ctx.getBean("beanBoarding");
//		boarding.greeting();
		boarding.assignProject();
	}
}
