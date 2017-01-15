package com.shopcar.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shopcar.components.entity.Address;
import com.shopcar.components.entity.request.AddressRequest;
import com.shopcar.service.AddressService;

@Configuration
@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	private AddressService addressService;
	

	@RequestMapping(value = "/show/{id}", method = RequestMethod.GET)
	public Address showOneAddress(@PathVariable("id") Long id) {
		return addressService.findAddressById(id);
	}
	
	@RequestMapping(value = "/show", method  = RequestMethod.GET)
	public Collection<Address> showAllAdvisers(){
		return addressService.findAllAddresses();
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public void createAddress(@RequestBody AddressRequest  addressRequest){
		addressService.createAddress(addressRequest);
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String deleteOneAddress(@PathVariable("id") Long id) {
		addressService.deleteAddress(id);
		return "Delete Address with id " + String.valueOf(id);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public String updateAddress(@RequestBody Address address) {
		addressService.updateAddress(address);		
		return "address was update: " + String.valueOf(address.getId());
	}
	
}
