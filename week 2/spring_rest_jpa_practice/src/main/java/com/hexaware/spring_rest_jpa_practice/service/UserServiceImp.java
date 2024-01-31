package com.hexaware.spring_rest_jpa_practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.spring_rest_jpa_practice.entity.Users;
import com.hexaware.spring_rest_jpa_practice.repository.UserRepository;

@Service
public class UserServiceImp implements IUserService {

	@Autowired
	UserRepository repo;
	
	@Override
	public Users addUser(Users user) {
		
		return repo.save(user);
	}

	@Override
	public Users updateUser(Users user) {
		
		return repo.save(user);
	}

	@Override
	public Users getUserById(long userID) {
		
		return repo.findById(userID).orElse(null);
	}

	@Override
	public String deleteUserById(long userID) {
		
		repo.deleteById(userID);
		return "record deleted";
	}

	@Override
	public List<Users> getAllUsers() {
		
		return repo.findAll();
	}

	@Override
	public List<Users> findByNameStartingWith(String prefix) {
		
		return repo.findByNameStartingWith(prefix);
	}

	

	

	


}
