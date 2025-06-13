package com.java.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PreBoarding {

	@Pointcut("execution(* com.java.aop.Boarding.*(..))")
	public void assignProject() {
		
	}
	
	@Before("assignProject()")
	public void mcqExam() {
		System.out.println("Please Check Cleared All Mcq Exams are Not...");
	}
	
	@After("assignProject()")
	public void assignLaptop() {
		System.out.println("Please Provide Laptop");
	}
	
	@AfterReturning(
			pointcut = "execution(* com.java.aop.Boarding.*(..))",
			returning = "result")
	public void myadvice(JoinPoint jp, Object result) {
		System.out.println("Additional Output");
		System.out.println("Method Signature  " + jp.getSignature());
		System.out.println("Result  " +result);
	}
	
}
