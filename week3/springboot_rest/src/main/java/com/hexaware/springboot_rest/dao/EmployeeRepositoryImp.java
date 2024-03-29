package com.hexaware.springboot_rest.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.springboot_rest.entity.Employee;


@Repository
public class EmployeeRepositoryImp implements IEmployeeRepository {

	JdbcTemplate jdbcTemplate;

	public EmployeeRepositoryImp() {

	}

	@Autowired
	public EmployeeRepositoryImp(DataSource datasource) {

		jdbcTemplate = new JdbcTemplate(datasource);

	}

	
	
	@Override
	public Employee addEmployee(Employee employee) {
		
		Employee emp=null;
		String insert ="insert into employee_table values(?,?,?)";
		int count=jdbcTemplate.update(insert,employee.getEid(),employee.getEname(),employee.getSalary());
		
		if(count>0) {
			emp=employee;
		}
		return emp;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		return null;
	}

	@Override
	public Employee getEmployeeById(int eid) {
		String search="select eid,ename,salary from employee_table where eid=?";
		Employee e=jdbcTemplate.queryForObject(search, new EmployeeMapper(), eid);  
		return e;
	}

	@Override
	public String deleteEmployeeById(int eid) {
		String delete="delete from employee_table where eid=?";
		int count=jdbcTemplate.update(delete,eid);
		return count+"record deleted";
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		String selectAll="select eid, ename,salary from employee_table";
		List<Employee> list=jdbcTemplate.query(selectAll, new EmployeeMapper());
		return list;
	}

}
