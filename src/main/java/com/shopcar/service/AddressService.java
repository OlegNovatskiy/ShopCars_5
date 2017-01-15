package com.shopcar.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopcar.components.entity.Address;
import com.shopcar.components.entity.request.AddressRequest;
import com.shopcar.components.interfaces.IAddress;

@Service
public class AddressService {

	@Autowired
	private IAddress iAddress;
	
	public Address findAddressById(Long id){
		return iAddress.findAddressById(id);
	}
	
	public Collection<Address> findAllAddresses(){
		return iAddress.findAllAddresses();
	}
	
	public void deleteAddress(Long id){
		iAddress.deleteAddress(id);
	}
	
	public void createAddress(AddressRequest addressRequest){
		iAddress.createAddress(addressRequest);
	}
	
	public void updateAddress(Address address){
		iAddress.updateAddress(address);
	}
	
}
