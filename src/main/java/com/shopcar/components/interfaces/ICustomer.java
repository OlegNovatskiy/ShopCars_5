package com.shopcar.components.interfaces;

import java.util.Collection;

import com.shopcar.components.entity.Customer;
import com.shopcar.components.entity.request.CustomerRequest;

public interface ICustomer {

	public Customer findCustomerById(Long id);
	
	public Collection<Customer> findAllCustomerses();
	
	public void updateCustomer(Customer customer);
	
	public void createCustomer(CustomerRequest customerRequest);
	
	public void deleteCustomer(Long id);
	
}
