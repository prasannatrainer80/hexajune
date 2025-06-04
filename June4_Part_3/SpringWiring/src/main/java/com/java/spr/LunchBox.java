package com.java.spr;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LunchBox {

	private String snacks;
	
	public void eat() {
		System.out.println("Eating : " +snacks);
	}
	
}
