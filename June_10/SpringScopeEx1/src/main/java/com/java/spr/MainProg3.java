package com.java.spr;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainProg3 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext("com.java.spr");
		TestDemo obj1 = context.getBean(TestDemo.class);
		TestDemo obj2 = context.getBean(TestDemo.class);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}
