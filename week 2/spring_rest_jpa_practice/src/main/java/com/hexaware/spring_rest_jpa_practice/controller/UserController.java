package com.hexaware.spring_rest_jpa_practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.spring_rest_jpa_practice.entity.Users;
import com.hexaware.spring_rest_jpa_practice.service.IUserService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	IUserService service ;
	
	@PostMapping("/insert")
	public Users insertUser(@RequestBody @Valid Users user) {
		
		return service.addUser(user);
	}

	@PutMapping("/update")
	public Users updateUser(@RequestBody @Valid Users user) {
		return service.updateUser(user);
	}

	@GetMapping("/get/{userID}")
	public Users getUserById(@PathVariable long  userID) {
		return service.getUserById(userID);
	}

	@DeleteMapping("/delete/{userID}")
	public String deleteUserById(@PathVariable long userID) {
		return service.deleteUserById(userID);
	}

	@GetMapping("/getall")
	public List<Users> getAllUsers(){
		return service.getAllUsers();
	}
	
	@GetMapping("/getbyprefix/{prefix}")
	public List<Users> findByNameStartingWith(@PathVariable String prefix){
		return service.findByNameStartingWith(prefix);
	}
	
}
