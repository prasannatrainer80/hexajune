package com.java.spr;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class HelloImpl implements Hello {

	private String greeting;

	@Override
	public String sayHello(String name) {
		return greeting + name;
	}
	
	
	
	
}
