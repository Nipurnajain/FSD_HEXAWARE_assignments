package com.hexaware.casestudy.service;

import com.hexaware.casestudy.entity.Customers;
import com.hexaware.casestudy.entity.Restaurants;

public interface IDashboardService {

	public Customers getUserDashboard(Long customerId);

	public Restaurants getRestaurantDashboard(Long restaurantId);
}
