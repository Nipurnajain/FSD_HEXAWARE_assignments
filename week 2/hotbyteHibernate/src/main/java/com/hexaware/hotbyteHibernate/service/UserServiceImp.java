package com.hexaware.hotbyteHibernate.service;

import java.io.Serializable;
import java.util.List;

import com.hexaware.hotbyteHibernate.dao.IUserDao;
import com.hexaware.hotbyteHibernate.dao.UserDaoImp;
import com.hexaware.hotbyteHibernate.entity.Users;

public class UserServiceImp implements IUserService {

	
	IUserDao dao=new UserDaoImp();;
	
	public UserServiceImp(IUserDao dao) {
        this.dao = dao;
    }
	
	@Override
	public Serializable insertUsers(Users user) {
		
		return dao.insertUsers(user);
	}

	@Override
	public boolean updateUsers(Users user) {
		
		return dao.updateUsers(user) ;
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

