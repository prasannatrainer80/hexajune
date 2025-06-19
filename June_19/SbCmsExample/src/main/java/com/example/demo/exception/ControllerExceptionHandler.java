package com.example.demo.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public ErrorCode resourceNotFound(ResourceNotFoundException ex, 
			WebRequest request
			) {
		ErrorCode message = new ErrorCode(HttpStatus.NOT_FOUND.value(), 
				
				new Date(), ex.getMessage(), request.getDescription(false));
		return message;
	}
}
