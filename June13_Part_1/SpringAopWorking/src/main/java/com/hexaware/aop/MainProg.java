package com.hexaware.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/hexaware/aop/aop.xml");
		Boarding boarding = (Boarding)ctx.getBean("beanBoarding");
		boarding.greeting();
		System.out.println(boarding.salary());
		System.out.println(boarding.status());
		boarding.assignProject();
	}
}
