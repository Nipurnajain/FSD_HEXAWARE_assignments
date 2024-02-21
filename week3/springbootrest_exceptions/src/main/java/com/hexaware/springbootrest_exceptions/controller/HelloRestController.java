package com.hexaware.springbootrest_exceptions.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloRestController {

	@GetMapping("/div/{num1}/{num2}")
	public String divNumbers(@PathVariable int num1,@PathVariable int num2) {
		
		int result=num1/num2;
		return "Division of numbers is "+result;
	}
	
	//@ResponseStatus(value=HttpStatus.EXPECTATION_FAILED, reason="sorry you cant divide number by 0")     //to print msg
//	@ExceptionHandler({ArithmeticException.class,NullPointerException.class})
//	public ResponseEntity<String> exceptionHandler() {	
//		
//		System.out.println("exception handled");
//		return new ResponseEntity<String>("number can't be divided by zero",HttpStatus.BAD_REQUEST);
//	}
	
}

