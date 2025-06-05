package com.java.spr;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

	private int id;
	private String name;
	private JobDetails jobDetails;
	private Family family;
	
	public void showAllInfo() {
		System.out.println(family);
		System.out.println(jobDetails);
		System.out.println("Id  " +id+ " Name  " +name);
	}

}
