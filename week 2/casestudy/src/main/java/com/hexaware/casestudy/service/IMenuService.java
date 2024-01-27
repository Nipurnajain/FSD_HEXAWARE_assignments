package com.hexaware.casestudy.service;

import java.util.List;

import com.hexaware.casestudy.entity.MenuItems;

public interface IMenuService {

	public List<MenuItems> getMenuByCategory(String category);

	public List<MenuItems> searchMenuItems(String keyword);
}
