package com.hexaware.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PreCheck {

	@Pointcut("execution(* com.hexaware.aop.Boarding.*(..))")
	public void assignProject() {}
	
	@Before("assignProject()")
	public void check() {
		System.out.println("Check all MCQs cleared or not...");
		System.out.println("Check cleared Capstone Project...");
	}
	
	@After("assignProject()")
	public void laptop() {
		System.out.println("Issue Laptop After Checking...");
	}
	
	@AfterReturning(
			pointcut = "execution(* com.hexaware.aop.Boarding.*(..))",
		returning = "result")
	public void showInfo(JoinPoint jp, Object result) {
		System.out.println("Additional Output");
		System.out.println("Method Signature  " + jp.getSignature());
		System.out.println("Result  " +result);
	}
	
}
