package com.shopcar.components.interfaces;

import java.util.Collection;

import com.shopcar.components.entity.Order;
import com.shopcar.components.entity.request.OrderRequest;

public interface IOrder {

	public Order findOrderById(Long id);

	public Collection<Order> findAllOrders();

	public void createOrder(OrderRequest orderRequest);

	public void updateOrder(Order order);

	public void deleteOrder(Long id);

}
