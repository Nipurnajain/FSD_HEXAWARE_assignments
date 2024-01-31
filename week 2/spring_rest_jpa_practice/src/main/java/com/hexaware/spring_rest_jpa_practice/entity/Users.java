package com.hexaware.spring_rest_jpa_practice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "user_info")
public class Users {

	@Id
	@NotNull
	private long userID;
	private String userName;
	private String password;
	@Pattern(regexp="[A-Z][a-z]{3,10} [A-Z][a-z]{3,10}")
	private String name;
	private String gender;
	@Email
	private String email;

	public Users() {

	}

	public Users(long userID, String userName, String password, String name, String gender, String email) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.email = email;

	}

	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Users [userID=" + userID + ", userName=" + userName + ", password=" + password + ", name=" + name
				+ ", gender=" + gender + ",  email=" + email + ", address=" + "]";
	}

}
