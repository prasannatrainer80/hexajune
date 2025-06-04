package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spr/name.xml");
		
		NameImpl nameImpl =(NameImpl)ctx.getBean("nameBean1");
		System.out.println(nameImpl.fullName());
		
		NameImpl obj = (NameImpl)ctx.getBean("nameBean2");
		System.out.println(obj.fullName());
	}
}
