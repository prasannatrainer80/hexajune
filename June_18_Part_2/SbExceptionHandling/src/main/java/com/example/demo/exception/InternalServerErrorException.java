package com.example.demo.exception;

public class InternalServerErrorException extends RuntimeException {

	public InternalServerErrorException(String error) {
		super(error);
	}
}

