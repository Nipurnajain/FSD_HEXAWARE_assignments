package com.hexaware.HotByte.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.HotByte.model.Users;


@Repository
public class UserDaoImp implements IUserDao {

	JdbcTemplate jdbcTemplate;
	
	@Autowired
	public UserDaoImp(DataSource datasource) {
		
		jdbcTemplate=new JdbcTemplate(datasource);   //datasource is interface and we need its implementation class
		System.out.println(jdbcTemplate);
	
	}
	
	@Override
	public boolean insertUsers(Users user) {
		
		String insertQuery="insert into users(userid,UserName, Password, Name, Gender, ContactNumber, Email, Address) values(?,?,?,?,?,?,?,?)";
		int count=jdbcTemplate.update(insertQuery,user.getUserID(),user.getUserName(),user.getPassword(),user.getName(),
				user.getGender(),user.getContactNumber(),user.getEmail(),user.getAddress());
		
		return count>0;
	}

	@Override
	public boolean updateUsers(Users user) {
		
		String updateQuery = "update users set userid=?, Password=? ,Name=?, Gender=?, ContactNumber=?, Email=?, Address=? where username=?";

		int count = jdbcTemplate.update(updateQuery,user.getUserID(),user.getPassword(),user.getName(),user.getGender(),
				user.getContactNumber(),user.getEmail(),user.getAddress(),user.getUserName()); 
				
		return count > 0;
	}

	@Override
	public boolean deleteUserByUsername(String username) {
		
		String deleteQuery = "delete from users  where username = ?";

		int count = jdbcTemplate.update(deleteQuery, username);

		return count > 0;
	}

	@Override
	public Users selectUserByUsername(String username) {
		
		String selectQueryById = "select userid,username, Password ,Name, Gender, ContactNumber, Email, Address from users where username=?"; 
				
		Users user = jdbcTemplate.queryForObject(selectQueryById, new UserMapper(), username);  
		
		return user;
	}

	@Override
	public List<Users> selectAllUsers() {
		
		String selectQuery = "select userid,username, Password ,Name, Gender, ContactNumber, Email, Address from users ";

		List<Users> list = jdbcTemplate.query(selectQuery, new UserMapper());

		return list;
	}

}
