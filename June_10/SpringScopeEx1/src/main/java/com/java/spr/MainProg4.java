package com.java.spr;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainProg4 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext("com.java.spr");
		ProtoTypeExample ex1 = context.getBean(ProtoTypeExample.class);
		ProtoTypeExample ex2 = context.getBean(ProtoTypeExample.class);
		ProtoTypeExample ex3 = context.getBean(ProtoTypeExample.class);
		
		System.out.println(ex1.hashCode());
		System.out.println(ex2.hashCode());
		System.out.println(ex3.hashCode());
	}
}
