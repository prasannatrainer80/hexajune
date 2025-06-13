package com.hexaware.aroundnew;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SegueTrainingAround {

	@Pointcut("execution(* com.hexaware.aroundnew.SegueTraining.*(..))")
	private void anyAdvice() {}
	
	@Around("anyAdvice() && args(batch2)")
	public Object beforeAdvice(ProceedingJoinPoint pjp, String batch2) throws Throwable {
		System.out.println("Around Method  " +pjp.getSignature());
		System.out.println("Before Calling Actual Method...");
		System.out.println("Your Trainer is Prasanna P...");
		System.out.println("He is FullStack Java Trainer...");
		Object obj = pjp.proceed();
//		System.out.println(obj);
		return obj;
	}
	
	@Around("anyAdvice() && args()")
	public Object beforeAdviceNull(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Around Method  " +pjp.getSignature());
		System.out.println("Its method with no params...");
		Object obj = pjp.proceed();
//		System.out.println(obj);
		return obj;
	}
}
