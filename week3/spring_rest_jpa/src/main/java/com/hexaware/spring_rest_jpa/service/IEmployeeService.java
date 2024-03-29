package com.hexaware.spring_rest_jpa.service;

import java.util.List;

import com.hexaware.spring_rest_jpa.entities.Employee;

public interface IEmployeeService {

	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public Employee getEmployeeById(long eid);

	public String deleteEmployeeById(long eid);

	public List<Employee> getAllEmployees();
	
	List<Employee> getByEname(String ename);
	
	List<Employee> getBySalaryGT(double salary);
	
	public List<Employee> getBySalarySorted();
	
	List<Employee> getBySalaryRange(double min, double max);

	public int deleteByEname(String ename);


}
