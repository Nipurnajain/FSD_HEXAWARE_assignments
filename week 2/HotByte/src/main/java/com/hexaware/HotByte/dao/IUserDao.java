package com.hexaware.HotByte.dao;

import java.util.List;

import com.hexaware.HotByte.model.Users;

public interface IUserDao {

	
	
public boolean insertUsers(Users user);
	
	public boolean updateUsers(Users user);
	
	public boolean deleteUserByUsername(String username) ;
	
	public Users selectUserByUsername(String username) ;
	
	public List<Users> selectAllUsers();
}
