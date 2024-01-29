package com.hexaware.springboot_webapp.dao;

import java.util.List;

import com.hexaware.springboot_webapp.entity.Employee;

public interface IEmployeeDao {

	public String addEmployee(Employee emp);
	public String updateEmployee(Employee emp);
	public String delete(int eid);
	public Employee search(int eid);
	public List<Employee> getAll();
	
}
