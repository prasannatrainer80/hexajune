package com.java.meeting;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PreMeeting {

	@Pointcut("execution(* com.java.meeting.Meeting.*(..))")
	public void scheduleMeeting() { }
	
	@Before("scheduleMeeting()")
	public void bookConferneceRoom() {
		System.out.println( "Please book in outlook for meeting room");
	}
	
	@After("scheduleMeeting()")
	public void releaseResources() {
		System.out.println("Send MOM discussion file and video...");
	}
}
