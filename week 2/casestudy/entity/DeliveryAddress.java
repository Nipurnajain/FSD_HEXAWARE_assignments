package com.hexaware.casestudy.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class DeliveryAddress {
	
	@Id
	private int  addressId;
	
	private String houseNo;
	private String area;
	private String landmark;
	private String city;
	private int pincode;
	
	@OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
    @JoinColumn(name = "aid")
    private Customers customer;
	
	public DeliveryAddress() {
		super();
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	public Customers getCustomer() {
		return customer;
	}
	public void setCustomer(Customers customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "DeliveryAddress [addressId=" + addressId + ", houseNo=" + houseNo + ", area=" + area + ", landmark="
				+ landmark + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
	
	
	
	

}