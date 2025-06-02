package com.java.hexa;

public class LambdaExpr3 {
	public static void main(String[] args) {
		FinEx1 obj1 = (str) -> {return "Hello " +str;};
		System.out.println(obj1.test("Sushmitha"));
	}
}
