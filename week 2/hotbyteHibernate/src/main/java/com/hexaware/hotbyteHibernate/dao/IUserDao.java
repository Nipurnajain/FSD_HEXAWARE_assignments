package com.hexaware.hotbyteHibernate.dao;

import java.io.Serializable;
import java.util.List;

import com.hexaware.hotbyteHibernate.entity.Users;

public interface IUserDao {

	
	
public Serializable insertUsers(Users user);
	
	public boolean updateUsers(Users user);
	
	public boolean deleteUserByUsername(String username) ;
	
	public Users selectUserByUsername(String username) ;
	
	public List<Users> selectAllUsers();
}
