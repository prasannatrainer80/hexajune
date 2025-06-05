package com.java.spr;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

	private int id;
	private String name;
	@Autowired
	private JobDetails jobDetails;
	private Family family;
	
	public void showAllInfo() {
		System.out.println(family);
		System.out.println(jobDetails);
		System.out.println("Id  " +id+ " Name  " +name);
	}

}
