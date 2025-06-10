package com.java.spr;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Bean;

@Component
@Scope("singleton")
public class TestDemo {

	private String name;
	
	@Bean
	public String sayHello() {
		return "Hello " +name;
	}
}
