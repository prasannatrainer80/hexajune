package com.java.meeting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/meeting/aop.xml");
		Meeting meeting = (Meeting)ctx.getBean("beanMeeting");
		meeting.scheduleMeeting();
	}
}
