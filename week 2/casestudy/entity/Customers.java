package com.hexaware.casestudy.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public final class Customers {
	
	@Id
	private int custId;
	private String custName;
	private String gender;
	private String email;
	private String phone;
	private String username;
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name= "aid")
	private DeliveryAddress address;
	
	 @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	 private Set<Orders> orderSet= new HashSet<>();
	 
	 @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
	    private Set<Payment> paymentSet = new HashSet<>(); 

	    @OneToOne(mappedBy = "customer",cascade = CascadeType.ALL)
	    private Cart cart;

	public Customers() {
		super();
	}

	public Customers(int custId, String custName, String gender, String email, String phone, String username,
			String password, DeliveryAddress address) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.username = username;
		this.password = password;
		this.address = address;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public DeliveryAddress getAddress() {
		return address;
	}

	public void setAddress(DeliveryAddress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customers [custId=" + custId + ", custName=" + custName + ", gender=" + gender + ", email=" + email
				+ ", phone=" + phone + ", username=" + username + ", password=" + password + ", address=" + address
				+ "]";
	}
	
	
	
	
	
	

}