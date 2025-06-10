package com.hexaware.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/hexaware/spr/bean.xml");
		HelloWorld helloWorld1 = (HelloWorld)ctx.getBean("beanHelloWorld");
		System.out.println(helloWorld1.hashCode());
		
		HelloWorld helloWorld2 = (HelloWorld)ctx.getBean("beanHelloWorld");
		System.out.println(helloWorld2.hashCode());
		
	}
}
