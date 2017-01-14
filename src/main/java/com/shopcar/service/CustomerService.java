package com.shopcar.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopcar.components.entity.Customer;
import com.shopcar.components.entity.request.CustomerRequest;
import com.shopcar.components.interfaces.ICustomer;

@Service
public class CustomerService {

	@Autowired
	private ICustomer iCustomer;
	
	public Customer findCustommerById(Long id){
		return iCustomer.findCustomerById(id);
	}
	
	public Collection<Customer> findAllCustomerses(){
		return iCustomer.findAllCustomerses();
	}
	
	public void deleteCustomer(Long id){
		iCustomer.deleteCustomer(id);
	}
	
	public void createCustomer(CustomerRequest customerRequest){
		iCustomer.createCustomer(customerRequest);
	}
	
	public void updateCustomer(Customer customer){
		iCustomer.updateCustomer(customer);
	}
	
}
