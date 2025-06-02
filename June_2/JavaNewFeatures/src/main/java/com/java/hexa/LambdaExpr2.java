package com.java.hexa;

public class LambdaExpr2 {
	public static void main(String[] args) {
		String s1="Ajay";
		IGreeting obj1 = (a) -> {
			return "Good Morning..."+a;
		};
		
		IGreeting obj2 = (a) -> {
			return "Good Afternoon..."+a;
		};
		
		IGreeting obj3 = (a) -> {
			return "Good Evening..."+a;
		};
		
		System.out.println(obj1.greeMe(s1));
		System.out.println(obj2.greeMe("Prasanna"));
		System.out.println(obj3.greeMe("Ayush"));
	}
}
