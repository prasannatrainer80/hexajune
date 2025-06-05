package com.java.spr;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employ {
	
	private int empno;
	private String name;
	private double basic;
	private Address address;
}
