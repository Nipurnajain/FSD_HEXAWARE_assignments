package com.hexaware.casestudy.entity;

import java.awt.MenuItem;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Restaurants {

    @Id
    private int restaurantId;
    
    private String name;

    private String location;

    private String contactNumber;

    private Double rating = 0.0;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "resId")
	private Set<MenuItems> menuItemSet = new HashSet<MenuItems>(); // collections should be initialized to avoid nullPoitner Escep

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
    private Set<Orders> orderSet = new HashSet<Orders>();
    
    @OneToMany(mappedBy = "restaurant",cascade = CascadeType.ALL)
    private Set<Discount> discountSet = new HashSet<Discount>() ;

	public Restaurants() {
		super();
	}

	public Restaurants(int restaurantId, String name, String location, String contactNumber, Double rating) {
		super();
		this.restaurantId = restaurantId;
		this.name = name;
		this.location = location;
		this.contactNumber = contactNumber;
		this.rating = rating;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Set<MenuItems> getMenuItemSet() {
		return menuItemSet;
	}

	public void setMenuItemSet(Set<MenuItems> menuItemSet) {
		this.menuItemSet = menuItemSet;
	}

	public Set<Orders> getOrderSet() {
		return orderSet;
	}

	public void setOrderSet(Set<Orders> orderSet) {
		this.orderSet = orderSet;
	}

	public Set<Discount> getDiscountSet() {
		return discountSet;
	}

	public void setDiscountSet(Set<Discount> discountSet) {
		this.discountSet = discountSet;
	}

	@Override
	public String toString() {
		return "Restaurants [restaurantId=" + restaurantId + ", name=" + name + ", location=" + location
				+ ", contactNumber=" + contactNumber + ", rating=" + rating + ", menuItemSet=" + menuItemSet
				+ ", orderSet=" + orderSet + ", discountSet=" + discountSet + "]";
	}
    
    



}