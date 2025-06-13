package com.hexaware.around;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/hexaware/around/aop.xml");
		Boarding boarding = (Boarding)ctx.getBean("beanBoarding");
//		boarding.assignProject("Mani");
		boarding.company();
		boarding.location();
	}
}
