package com.hexaware.spring_rest_jpa_practice.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hexaware.spring_rest_jpa_practice.entity.Users;

@SpringBootTest
class UserControllerTest {

	@Autowired
	RestTemplate restTemplate;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testInsertUser() {

		Users user = new Users(9, "mahima", "mahi123", "Mahima Nagar", "female", "mahi@gmail.com");
		ResponseEntity<Users> response = restTemplate.postForEntity("http://localhost:8080/api/users/insert", user,
				Users.class);
		Users u = response.getBody();
		assertEquals("mahima", u.getUserName());
	}

	@Test
	void testUpdateUser() {

		Users updatedUser = new Users(8, "aditya", "aditya1", "Aditya Rajput", "male", "aditya@gmail.com");
		restTemplate.put("http://localhost:8080/api/users/update", updatedUser);
		assertTrue(true);
	}

	@Test
	void testGetUserById() {

		int userID = 4;
		ResponseEntity<Users> response = restTemplate.getForEntity("http://localhost:8080/api/users/get/" + userID,
				Users.class);
		Users u = response.getBody();
		assertEquals("aditi", u.getUserName());
		assertNotNull(u);
	}

	@Test
	void testDeleteUserById() {
		int userId = 9;
		ResponseEntity<String> response = restTemplate.exchange("http://localhost:8080/api/users/delete/" + userId,
				org.springframework.http.HttpMethod.DELETE, null, String.class, userId);
		String u = response.getBody();
		assertEquals("record deleted", u);
	}

	@Test
	void testGetAllUsers() {
		ResponseEntity<List> response = restTemplate.getForEntity("http://localhost:8080/api/users/getall", List.class);
		List<Users> list = response.getBody();
		assertTrue(list.size() > 0);

	}

}
