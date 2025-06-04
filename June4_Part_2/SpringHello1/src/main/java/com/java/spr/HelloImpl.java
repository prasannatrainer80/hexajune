package com.java.spr;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloImpl implements Hello {

	private String greeting;

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return greeting+name;
	}
}
