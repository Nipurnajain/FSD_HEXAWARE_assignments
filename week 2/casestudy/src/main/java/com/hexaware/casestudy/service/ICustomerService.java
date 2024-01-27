package com.hexaware.casestudy.service;

import com.hexaware.casestudy.entity.Customers;

public interface ICustomerService {

	public long registerCustomer(Customers customer);

	public String loginCustomer(Customers customer);
}
