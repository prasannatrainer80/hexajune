package com.java.spr;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {

	private int sno;
	private String name;
	private LunchBox lunchBox;
	
	public void display() {
		System.out.println("Sno  " +sno+ " Student Name  " +name);
		lunchBox.eat();
	}
}
