package com.shopcar.components.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.shopcar.components.entity.Car;
import com.shopcar.components.entity.Customer;
import com.shopcar.components.entity.request.CustomerRequest;
import com.shopcar.components.interfaces.ICustomer;

@Repository
public class CustomerDAO implements ICustomer {

	@Autowired
	private JdbcTemplate jdbc;

	public static class workingWithRowMap implements RowMapper<Customer> {

		/**
		 * Copy data about customer from DB.
		 */
		public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
			Customer customer = new Customer();
			customer.setId(rs.getLong(1));
			customer.setFnameCustomer(rs.getString(2));
			customer.setSnameCustomer(rs.getString(3));
			customer.setGenderCustomer(rs.getBoolean(4));

			return customer;
		}

	}

	public Customer findCustomerById(Long id) {
		Customer cutomer = jdbc.queryForObject("Select * From ShopCars.Customers WHERE ShopCars.Customers.id = ?",
				new workingWithRowMap(), id);
		return cutomer;
	}

	public Collection<Customer> findAllCustomerses() {
		List<Customer> customers = jdbc.query("SELECT * FROM ShopCars.Customers", new workingWithRowMap());
		return customers;
	}

	public void updateCustomer(Customer customer) {
		jdbc.update("UPDATE ShopCars.Customers SET" + " fname_customer = " + customer.getFnameCustomer()
				+ " sname_customer = " + customer.getSnameCustomer() + " married_customer = "
				+ String.valueOf(customer.getMarriedCustomer()) + " gender_customer"
				+ String.valueOf(customer.getGenderCustomer()) + " WHERE id =" + String.valueOf(customer.getId()));
	}

	public void createCustomer(CustomerRequest customerRequest) {
		jdbc.update(
				"INSERT INTO ShopCars.Customers (fname_customer, sname_customer, married_customer, gender_customer) "
						+ "values ('" + customerRequest.getFnameCustomer() + "','" + customerRequest.getSnameCustomer()
						+ "','" + String.valueOf(customerRequest.getMarriedCustomer()) + "','"
						+ String.valueOf(customerRequest.getGenderCustomer()) + "');");
	}

	public void deleteCustomer(Long id) {
		jdbc.update("DELETE FROM ShopCars.Customers WHERE ShopCars.Customers.id = " + String.valueOf(id));
	}

}
