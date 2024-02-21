package com.hexaware.springbootrest_exceptions.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ResponseStatus(value=HttpStatus.NOT_ACCEPTABLE,reason="some exception occured")
	@ExceptionHandler({ArithmeticException.class})
	public void handleExp() {
		
	}
}
