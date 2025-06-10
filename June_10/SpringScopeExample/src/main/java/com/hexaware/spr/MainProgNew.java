package com.hexaware.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProgNew {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/hexaware/spr/bean1.xml");
		HelloWorld hw1 = (HelloWorld)ctx.getBean("beanHelloWorld");
		System.out.println(hw1.hashCode());
		
		HelloWorld hw2 = (HelloWorld)ctx.getBean("beanHelloWorld");
		System.out.println(hw2.hashCode());
		
	}
}
