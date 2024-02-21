package com.hexaware.springboot_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springboot_rest.dao.IEmployeeRepository;
import com.hexaware.springboot_rest.entity.Employee;


@Service
public class EmployeeServiceImp implements IEmployeeService {

	@Autowired
	IEmployeeRepository repo;
	
	@Override
	public Employee addEmployee(Employee employee) {
		
		return repo.addEmployee(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		return null;
	}

	@Override
	public Employee getEmployeeById(int eid) {
		
		return repo.getEmployeeById(eid);
	}

	@Override
	public String deleteEmployeeById(int eid) {
		return repo.deleteEmployeeById(eid);
		
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return repo.getAllEmployees();
	}

}
