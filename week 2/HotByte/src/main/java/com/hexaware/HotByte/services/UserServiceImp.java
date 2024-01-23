package com.hexaware.HotByte.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.HotByte.dao.IUserDao;
import com.hexaware.HotByte.model.Users;

@Service
public class UserServiceImp implements IUserService {

	@Autowired
	IUserDao dao;
	
	@Override
	public boolean insertUsers(Users user) {
		
		return dao.insertUsers(user);
	}

	@Override
	public boolean updateUsers(Users user) {
		
		return dao.updateUsers(user);
	}

	@Override
	public boolean deleteUserByUsername(String username) {
		
		return dao.deleteUserByUsername(username);
	}

	@Override
	public Users selectUserByUsername(String username) {
		
	   return dao.selectUserByUsername(username);
		
	}
	

	@Override
	public List<Users> selectAllUsers() {
		
		return dao.selectAllUsers();
	}

	

}

