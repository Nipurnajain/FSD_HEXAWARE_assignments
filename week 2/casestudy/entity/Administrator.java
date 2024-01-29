package com.hexaware.casestudy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Administrator")
public class Administrator {

	@Id
	@Column(name = "AdminID")
	private int adminId;

	@Column(name = "UserName", nullable = false, unique = true)
	private String userName;

	@Column(name = "Password", nullable = false)
	private String password;

	@Column(name = "Name")
	private String name;

	@Column(name = "Email", unique = true)
	private String email;

	public Administrator() {
		super();
	}

	public Administrator(int adminId, String userName, String password, String name, String email) {
		super();
		this.adminId = adminId;
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.email = email;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Administrator [adminId=" + adminId + ", userName=" + userName + ", password=" + password + ", name="
				+ name + ", email=" + email + "]";
	}

}
