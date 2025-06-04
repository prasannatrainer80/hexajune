package com.java.spr;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Faculty {

	private String facultyName;
	private List<Student> studentsList;
	
	public void teaching() {
		System.out.println("Faculty  " +facultyName + " Sharing lunch with Students");
		for (Student student : studentsList) {
			student.display();
		}
	}
}
