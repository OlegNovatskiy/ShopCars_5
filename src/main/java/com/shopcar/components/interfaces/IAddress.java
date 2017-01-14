package com.shopcar.components.interfaces;

import java.util.Collection;

import com.shopcar.components.entity.Address;
import com.shopcar.components.entity.request.AddressRequest;

public interface IAddress {

	public Address findAddressById(Long id);

	public Collection<Address> findAllAddresses();

	public void updateAddress(Address address);

	public void createAddress(AddressRequest addressRequest);

	public void deleteAddress(Long id);

}
