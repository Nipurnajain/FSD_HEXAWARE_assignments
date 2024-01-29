package com.hexaware.casestudy.service;

import java.awt.Menu;
import java.util.List;

import com.hexaware.casestudy.entity.MenuItems;
import com.hexaware.casestudy.entity.Restaurants;

public interface IRestaurantService {

	public Long registerRestaurant(Restaurants restaurant);

	public String loginRestaurant(Restaurants restaurant);

	public void addMenu(Menu menuDTO);

	public void updateMenu(MenuItems menu);

	public void deleteMenu(Long menuId);

	public List<MenuItems> getMenuByCategory(String category);

	public List<MenuItems> getOrdersByRestaurantId(Long restaurantId);
}
