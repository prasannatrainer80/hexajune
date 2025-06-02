package com.java.hexa;

public class LambdaExpr1 {

	public static void main(String[] args) {
		IHello obj1 = () -> {
			System.out.println("Hi I am Kavin Kumar...Lambda Expression...");
		};
		
		IHello obj2 = () -> {
			System.out.println("Hi I am Sandhiya...Lambda Expression...");
		};
		
		IHello obj3 = () -> {
			System.out.println("HI I am Rishab...Lambda Expression...");
		};
		obj1.sayHello();
		obj2.sayHello();
		obj3.sayHello();
	}
}
