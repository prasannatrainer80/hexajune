package com.java.spr;

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
public class HelloWorld {
	private String name;
	
	public void show() {
		System.out.println("Name is  " +name);
	}
}
