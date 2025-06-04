package com.java.spr;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloImpl implements Hello {

	private String welcomeNote;
	private String greeting;
	private String endNote;
	
	@Override
	public void sayHello(String name) {
		System.out.println(welcomeNote);
		System.out.println(greeting+name);
		System.out.println(endNote);
	}

}
