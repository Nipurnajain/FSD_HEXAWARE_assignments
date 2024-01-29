package com.hexaware.casestudy.service;

import com.hexaware.casestudy.entity.Orders;

public interface IOrderService {

	public Long placeOrder(Orders order);

	public Orders getOrderById(Long orderId);

	public void updateOrderStatus(Long orderId, String status);
}
