package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg2 {
	public static void main(String[] args) {
		ApplicationContext ctx = 
			new ClassPathXmlApplicationContext("com/java/spr/hello1.xml");
		HelloWorld helloWorld1 = (HelloWorld)ctx.getBean("beanHelloWorld");
		HelloWorld helloWorld2 = (HelloWorld)ctx.getBean("beanHelloWorld");
		HelloWorld helloWorld3 = (HelloWorld)ctx.getBean("beanHelloWorld");
		
		
		System.out.println(helloWorld1.hashCode());
		System.out.println(helloWorld2.hashCode());
		System.out.println(helloWorld3.hashCode());
	}
}
