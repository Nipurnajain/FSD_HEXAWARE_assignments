package com.hexaware.springboot_rest.dao;

import java.util.List;

import com.hexaware.springboot_rest.entity.Employee;

public interface IEmployeeRepository {

	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public Employee getEmployeeById(int eid);

	public String deleteEmployeeById(int eid);

	public List<Employee> getAllEmployees();
}
