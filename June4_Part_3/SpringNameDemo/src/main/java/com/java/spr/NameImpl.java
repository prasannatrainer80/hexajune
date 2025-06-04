package com.java.spr;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NameImpl implements Name {
	
	private String firstName;
	private String lastName;
	
	@Override
	public String fullName() {
		// TODO Auto-generated method stub
		return firstName + " " +lastName;
	}
	
	
}
