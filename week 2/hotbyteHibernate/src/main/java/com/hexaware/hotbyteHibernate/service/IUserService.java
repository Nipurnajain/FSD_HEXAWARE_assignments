package com.hexaware.hotbyteHibernate.service;

import java.io.Serializable;
import java.util.List;

import com.hexaware.hotbyteHibernate.entity.Users;


public interface IUserService {

	
public Serializable insertUsers(Users user);
	
	public boolean updateUsers(Users user);
	
	public boolean deleteUserByUsername(String custname);
	
	public Users selectUserByUsername(String custname);
	
	public List<Users> selectAllUsers();
}
