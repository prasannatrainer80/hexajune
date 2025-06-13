package com.hexaware.around;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class BoardingAspect {

	@Pointcut("execution(* com.hexaware.around.Boarding.*(..))")
	private void anyAdvice() {}
	
	@Around("anyAdvice() && args(student)")
	public Object beforeAdvice(ProceedingJoinPoint pjp, String student) throws Throwable {
		System.out.println("Around Method  " +pjp.getSignature());
		System.out.println("Before Calling Actual Method...");
		Object obj = pjp.proceed();
//		System.out.println(obj);
		return obj;
	}
}
