package com.java.hib;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="StudentHexa")
public class Student {

	@Id
	private int studentId;
	private String studentName;
	private String qualification;
	
	private List<Student> studentsList;
}
