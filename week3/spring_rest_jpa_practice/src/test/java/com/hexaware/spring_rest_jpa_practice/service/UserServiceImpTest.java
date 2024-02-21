package com.hexaware.spring_rest_jpa_practice.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.spring_rest_jpa_practice.entity.Users;

@SpringBootTest
class UserServiceImpTest {

	@Autowired
	IUserService service;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	
	@Test
	void testAddUser() {
		
		Users user= new Users(9,"mahima","mahi123","Mahima Nagar","female","mahima@gmail.com");
		Users u1=service.addUser(user);
		assertNotNull(u1);
		assertEquals(9,u1.getUserID());
	}
	
	@Test
	void testUpdateUser() {
		Users updatedUser = new Users(8, "adi", "aditya1", "Aditya Rajput", "male", "aditya@gmail.com");
		service.updateUser(updatedUser);
		assertTrue(true);
		
	}

	
	@Test
	void testGetUserById() {
		Users user=service.getUserById(6);
		assertEquals("stuti",user.getUserName());
		
	}

	@Test
	void testDeleteUserById() {
		String user=service.deleteUserById(8);
		assertEquals("record deleted",user);
	}

	
	@Test
	void testGetAllUsers() {
		List<Users> list=service.getAllUsers();
		boolean flag=list.isEmpty();
		assertFalse(flag);
	}

}
