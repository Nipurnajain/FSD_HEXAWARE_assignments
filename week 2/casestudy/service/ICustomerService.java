package com.hexaware.casestudy.service;

import java.util.List;

import com.hexaware.casestudy.entity.Customers;
import com.hexaware.casestudy.entity.Restaurants;

public interface ICustomerService {

	public long registerCustomer(Customers customer);

	public String loginCustomer(Customers customer);
	public List<Restaurants> getRestaurantByLocation(String location);
}
