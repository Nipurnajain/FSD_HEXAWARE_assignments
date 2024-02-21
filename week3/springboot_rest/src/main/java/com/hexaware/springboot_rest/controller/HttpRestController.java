package com.hexaware.springboot_rest.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restapi")
public class HttpRestController {

	
	
	//@RequestMapping(value="/get" , method=RequestMethod.GET)
	@GetMapping("/get")
	public String getData() {
		return "get method executed";
	}
	
	@PostMapping("/add")
	public String addData() {
		return "post method executed";
	}
	
	@PutMapping("/update")
	public String updateData() {
		return "put method executed";
	}
	
	@DeleteMapping("/delete")
	public String deleteData() {
		return "delete method executed";
	}
	
}
