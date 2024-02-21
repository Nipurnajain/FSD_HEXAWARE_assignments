package com.hexaware.spring_rest_jpa_practice.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.hexaware.spring_rest_jpa_practice.entity.Users;

public interface IUserService  {

	public Users addUser(Users user);

	public Users updateUser(Users user);

	public Users getUserById(long userID);

	public String deleteUserById(long userID);

	public List<Users> getAllUsers();
	
	List<Users> findByNameStartingWith( String prefix);
	
	
	
	
	
}
