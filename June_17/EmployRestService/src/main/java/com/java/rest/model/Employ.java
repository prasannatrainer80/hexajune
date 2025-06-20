package com.java.rest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employ {

	private int empno;
	private String name;
	private String gender;
	private String dept;
	private String desig;
	private double basic;
}
