package com.hexaware.springboot_rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springboot_rest.entity.Employee;
import com.hexaware.springboot_rest.service.IEmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

	@Autowired
	IEmployeeService service;
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee emp) {
		
		return service.addEmployee(emp);
		
	}
	
	@GetMapping("/getall")
	public List<Employee> getAllEmployee(){
		
		return service.getAllEmployees();
	}
	
	@GetMapping("/get/{eid}")
	public Employee getById(@PathVariable int eid) {
		return service.getEmployeeById(eid);
	}
	
	@DeleteMapping("/delete/{eid}")
	public String deleteById(@PathVariable int eid) {
		return service.deleteEmployeeById(eid);
	}
}
