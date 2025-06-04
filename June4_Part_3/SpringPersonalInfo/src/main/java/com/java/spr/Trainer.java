package com.java.spr;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Trainer {

	private String trainerName;
	private String location;
	private List<Student> studentList;
	
	public void showInfo() {
		System.out.println("Trainer Name  " +trainerName);
		System.out.println("Location  " +location);
		System.out.println("Students List is  ");
		for (Student student : studentList) {
			System.out.println(student);
		}
	}
}
