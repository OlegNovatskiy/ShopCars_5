package com.shopcar.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shopcar.components.entity.Order;
import com.shopcar.components.entity.request.OrderRequest;
import com.shopcar.service.OrderService;

@Configuration
@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	

	@RequestMapping(value = "/show/{id}", method = RequestMethod.GET)
	public Order showOneOrder(@PathVariable("id") Long id) {
		return orderService.findOrderById(id);
	}
	
	@RequestMapping(value = "/show", method  = RequestMethod.GET)
	public Collection<Order> showAllOrder(){
		return orderService.findAllOrders();
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public void createOrder(@RequestBody OrderRequest orderRequest){
		orderService.createOrder(orderRequest);
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String deleteOneOrder(@PathVariable("id") Long id) {
		orderService.deleteOrder(id);
		return "Delete Order with id " + String.valueOf(id);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public String updateCar(@RequestBody Order order) {
		orderService.updateOrder(order);		
		return "Order was update: " + String.valueOf(order.getId());
	}
	
}
