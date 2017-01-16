package com.shopcar.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shopcar.components.entity.Seller;
import com.shopcar.components.entity.request.SellerRequest;
import com.shopcar.service.SellerService;

@Configuration
@RestController
@RequestMapping(value = "seller")
public class SellerController {

	@Autowired
	private SellerService sellerService;
	

	@RequestMapping(value = "/show/{id}", method = RequestMethod.GET)
	public Seller showOneCustomer(@PathVariable("id") Long id) {
		return sellerService.findSellerById(id);
	}
	
	@RequestMapping(value = "/show", method  = RequestMethod.GET)
	public Collection<Seller> showAllSellers(){
		return sellerService.findAllCustomerses();
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public void createCustomer(@RequestBody SellerRequest sellerRequest){
		sellerService.createSeller(sellerRequest);
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String deleteOneCustomer(@PathVariable("id") Long id) {
		sellerService.deleteSeller(id);
		return "Delete customer with id " + String.valueOf(id);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public String updateCar(@RequestBody Seller seller) {
		sellerService.updateSeller(seller);		
		return "Car was update: " + String.valueOf(seller.getId());
	}
	
}
