package com.hexaware.springboot_webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/webapp")                 //mandatory
public class HelloController {

	@RequestMapping("/hello")              //not mandatory, just to make more meaningful
	@ResponseBody                           //mandatory
	public String sayHello() {
		return "Hello friends!";
	}
	
	@RequestMapping(value="/show", method=RequestMethod.GET)              //not mandatory, just to make more meaningful
	@ResponseBody 
	public String show() {
		return "<h1 style='color:red'>Welcome to web</h1>";
	}
	
	
}
