package com.shopcar.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shopcar.components.entity.Customer;
import com.shopcar.components.entity.request.CustomerRequest;
import com.shopcar.service.CustomerService;

@Configuration
@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	

	@RequestMapping(value = "/show/{id}", method = RequestMethod.GET)
	public Customer showOneCustomer(@PathVariable("id") Long id) {
		return customerService.findCustommerById(id);
	}
	
	@RequestMapping(value = "/show", method  = RequestMethod.GET)
	public Collection<Customer> showAllCustomer(){
		return customerService.findAllCustomerses();
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public void createCustomer(@RequestBody CustomerRequest customerRequest){
		customerService.createCustomer(customerRequest);
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String deleteOneCustomer(@PathVariable("id") Long id) {
		customerService.deleteCustomer(id);
		return "Delete customer with id " + String.valueOf(id);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public String updateCar(@RequestBody Customer customer) {
		customerService.updateCustomer(customer);		
		return "Car was update: " + String.valueOf(customer.getId());
	}
}
