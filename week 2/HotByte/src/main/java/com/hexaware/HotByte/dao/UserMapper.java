package com.hexaware.HotByte.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hexaware.HotByte.model.Users;




	public class UserMapper implements RowMapper<Users> {

		@Override
		public Users mapRow(ResultSet rs, int rowNum) throws SQLException {

			Users user=new Users();
			
			user.setUserID(rs.getInt("userid"));
			user.setUserName(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			user.setName(rs.getString("name"));
			user.setGender(rs.getString("gender"));
			user.setContactNumber(rs.getString("contactnumber"));
			user.setEmail(rs.getString("email"));
			user.setAddress(rs.getString("address"));
			
			

			return user;
		}


}
