package com.hexaware.casestudy.entity;

import java.awt.MenuItem;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderDetails {
	@Id
	@Column(name = "OrderDetailID")
	private int orderDetailId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "OrderID")
	private Orders order;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "MenuID")
	private MenuItems menuItem;

	private int quantity;

	public OrderDetails() {
		super();
	}

	public OrderDetails(int orderDetailId, Orders order, MenuItems menuItem, int quantity) {
		super();
		this.orderDetailId = orderDetailId;
		this.order = order;
		this.menuItem = menuItem;
		this.quantity = quantity;
	}

	public int getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(int orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public MenuItems getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(MenuItems menuItem) {
		this.menuItem = menuItem;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "OrderDetails [orderDetailId=" + orderDetailId + ", order=" + order + ", menuItem=" + menuItem
				+ ", quantity=" + quantity + "]";
	}

}