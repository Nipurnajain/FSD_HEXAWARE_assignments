package com.hexaware.casestudy.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class MenuItems {

	@Id
	private Long menuitemId;

	private String itemName;

	private String description;

	private String category;

	private Double price;

	private String availabilityTime;

	private String specialDietaryInfo;

	private String tasteInfo;

	private String nutritionalInfo;

	private Integer cookingTime;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "RestaurantID")
	private Restaurants restaurant;

	@OneToMany(mappedBy = "menuItem", cascade = CascadeType.ALL)
	private Set<OrderDetails> orderDetailsSet = new HashSet<OrderDetails>();

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CartID")
	private Cart cart;

	public MenuItems() {
		super();
	}

	public MenuItems(Long menuitemId, String itemName, String description, String category, Double price,
			String availabilityTime, String specialDietaryInfo, String tasteInfo, String nutritionalInfo,
			Integer cookingTime, Restaurants restaurant, Set<OrderDetails> orderDetailsSet, Cart cart) {
		super();
		this.menuitemId = menuitemId;
		this.itemName = itemName;
		this.description = description;
		this.category = category;
		this.price = price;
		this.availabilityTime = availabilityTime;
		this.specialDietaryInfo = specialDietaryInfo;
		this.tasteInfo = tasteInfo;
		this.nutritionalInfo = nutritionalInfo;
		this.cookingTime = cookingTime;
		this.restaurant = restaurant;
		this.orderDetailsSet = orderDetailsSet;
		this.cart = cart;
	}

	public Long getMenuitemId() {
		return menuitemId;
	}

	public void setMenuitemId(Long menuitemId) {
		this.menuitemId = menuitemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getAvailabilityTime() {
		return availabilityTime;
	}

	public void setAvailabilityTime(String availabilityTime) {
		this.availabilityTime = availabilityTime;
	}

	public String getSpecialDietaryInfo() {
		return specialDietaryInfo;
	}

	public void setSpecialDietaryInfo(String specialDietaryInfo) {
		this.specialDietaryInfo = specialDietaryInfo;
	}

	public String getTasteInfo() {
		return tasteInfo;
	}

	public void setTasteInfo(String tasteInfo) {
		this.tasteInfo = tasteInfo;
	}

	public String getNutritionalInfo() {
		return nutritionalInfo;
	}

	public void setNutritionalInfo(String nutritionalInfo) {
		this.nutritionalInfo = nutritionalInfo;
	}

	public Integer getCookingTime() {
		return cookingTime;
	}

	public void setCookingTime(Integer cookingTime) {
		this.cookingTime = cookingTime;
	}

	public Restaurants getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurants restaurant) {
		this.restaurant = restaurant;
	}

	public Set<OrderDetails> getOrderDetailsSet() {
		return orderDetailsSet;
	}

	public void setOrderDetailsSet(Set<OrderDetails> orderDetailsSet) {
		this.orderDetailsSet = orderDetailsSet;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "MenuItems [menuitemId=" + menuitemId + ", itemName=" + itemName + ", description=" + description
				+ ", category=" + category + ", price=" + price + ", availabilityTime=" + availabilityTime
				+ ", specialDietaryInfo=" + specialDietaryInfo + ", tasteInfo=" + tasteInfo + ", nutritionalInfo="
				+ nutritionalInfo + ", cookingTime=" + cookingTime + ", restaurant=" + restaurant + ", orderDetailsSet="
				+ orderDetailsSet + ", cart=" + cart + "]";
	}

}