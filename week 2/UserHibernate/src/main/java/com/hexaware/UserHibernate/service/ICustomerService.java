package com.hexaware.UserHibernate.service;

import java.util.List;

import com.hexaware.UserHibernate.model.Customer;

public interface ICustomerService {

	
public boolean insertCustomer(Customer cust);
	
	public boolean updateCustomer(Customer cust);
	
	public boolean deleteCustomer(String custname);
	
	public Customer selectCustomer(String custname);
	
	public List<Customer> selectAllCustomers();
}
