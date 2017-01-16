package com.shopcar.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopcar.components.entity.Order;
import com.shopcar.components.entity.request.OrderRequest;
import com.shopcar.components.interfaces.IOrder;

@Service
public class OrderService {

	@Autowired
	private IOrder iOrder;
	
	public Order findOrderById(Long id){
		return iOrder.findOrderById(id);
	}
	
	public Collection<Order> findAllOrders(){
		return iOrder.findAllOrders();
	}
	
	public void deleteOrder(Long id){
		iOrder.deleteOrder(id);
	}
	
	public void createOrder(OrderRequest orderRequest){
		iOrder.createOrder(orderRequest);
	}
	
	public void updateOrder(Order order){
		iOrder.updateOrder(order);
	}
	
}
