package com.java.hexa;

public class LambdaExpr4 {
	public static void main(String[] args) {
		String course1 = "Foundation";
		String course2 = "Advanced";
		String course3 = "Premier";
		FinEx2 obj1 = (x) -> {return "Core Java and Basics to be Covered...";};
		FinEx2 obj2 = (x) -> {return "Adv Java with Angular to be Covered...";};
		FinEx2 obj3 = (x) -> {return "Both are Covered...";};
		
		System.out.println(obj1.topic(course1));
		System.out.println(obj2.topic(course2));
		System.out.println(obj3.topic(course3));
	}
}
