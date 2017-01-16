package com.shopcar.components.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.shopcar.components.entity.Address;
import com.shopcar.components.entity.Order;
import com.shopcar.components.entity.request.OrderRequest;
import com.shopcar.components.interfaces.IOrder;
import com.shopcar.components.service.AddressDAO.workingWithRowMap;

@Repository
public class OrderDAO implements IOrder{

	@Autowired
	private JdbcTemplate jdbc;
	
	public static class workingWithRowMap implements RowMapper<Order> {

		/**
		 * Copy data about Order from DB.
		 */
		public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
			Order order = new Order();
			order.setId(rs.getLong(1));
			order.setIdCar(rs.getLong(2));
			order.setIdSeller(rs.getLong(3));
			order.setIdCustomer(rs.getLong(4));
			order.setIdAddress(rs.getLong(5));
			order.setDateOrder(rs.getDate(6));

			return order;
		}

	}	
	
	public Order findOrderById(Long id) {
		Order order = jdbc.queryForObject("Select * From ShopCars.Orders WHERE ShopCars.Orders.id = ?", new workingWithRowMap(), id);
		return order;
	}

	public Collection<Order> findAllOrders() {
		List<Order> orders = jdbc.query("SELECT * FROM ShopCars.Orders", new workingWithRowMap());
		return orders;
	}

	public void createOrder(OrderRequest orderRequest) {
		jdbc.update(
				"INSERT INTO ShopCars.Orders (id_car, id_seller, id_customer, id_address, date_order) values ('" 
						+ orderRequest.getIdCar() + "','" 
						+ orderRequest.getIdSeller()	+ "','" 
						+ orderRequest.getIdCustomer() + "','"
						+ orderRequest.getIdAddress() + "','"
						+ orderRequest.getDateOrder()+"');");
	}

	public void updateOrder(Order order) {
		jdbc.update("UPDATE ShopCars.Orders SET id_car = '"+
				order.getIdCar() + "', id_seller ='"+
				order.getIdSeller() + "', id_customer ='"+
				order.getIdCustomer() + "', id_address ='" +
				order.getIdAddress() + "', date_order ='" +
				order.getDateOrder() + "' "+
				"WHERE ShopCars.Orders.id = " + String.valueOf(order.getId()));
	}

	public void deleteOrder(Long id) {
		jdbc.update("DELETE FROM ShopCars.Orders WHERE ShopCars.Orders.id = " + String.valueOf(id));
	}

}
