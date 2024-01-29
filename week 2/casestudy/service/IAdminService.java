package com.hexaware.casestudy.service;

import java.util.List;

import com.hexaware.casestudy.entity.Administrator;
import com.hexaware.casestudy.entity.Customers;
import com.hexaware.casestudy.entity.MenuItems;
import com.hexaware.casestudy.entity.Orders;
import com.hexaware.casestudy.entity.Restaurants;

public interface IAdminService {

	public String adminLogin(Administrator admin);

	public Restaurants addRestaurant(Restaurants restaurant);

	public void removeRestaurant(Long restaurantId);

	public List<MenuItems> getAllMenus();

	public List<Restaurants> getAllRestaurants();

	public List<Orders> getAllOrders();

	public Restaurants addCustomers(Customers customer);
	public Restaurants addMenuItem(MenuItems menuItem);
	
	public void removeCustomers(Long custId);
	public void removeMenuItems(Long menuItemId);
}
