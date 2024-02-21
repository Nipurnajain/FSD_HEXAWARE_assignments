package com.hexaware.spring_rest_jpa.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.spring_rest_jpa.entities.Employee;

@SpringBootTest
//@Transactional
class EmployeeServiceImpTest {

	Logger logger=LoggerFactory.getLogger(EmployeeServiceImpTest.class);
	
	@Autowired
	IEmployeeService service;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testAddEmployee() {
		Employee emp=new Employee(108,"joe",9000);
		
		Employee e1=service.addEmployee(emp);
		
		logger.info("employee added successfully");
		
		assertNotNull(e1);
		assertEquals(106,e1.getEid());
		
		
		
	}

	@Test
	void testUpdateEmployee() {
		
	}

	@Test
	void testGetEmployeeById() {
		
		Employee emp=service.getEmployeeById(101);
		assertEquals("Nipurna", emp.getEname());
	}

	@Test
	void testGetAllEmployees() {
		
		List<Employee> list =service.getAllEmployees();
		boolean flag=list.isEmpty();
		assertFalse(flag);
				
	
	}

}
