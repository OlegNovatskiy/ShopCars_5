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
import com.shopcar.components.entity.request.AddressRequest;
import com.shopcar.components.interfaces.IAddress;

@Repository
public class AddressDAO implements IAddress{

	@Autowired
	private JdbcTemplate jdbc;
	
	public static class workingWithRowMap implements RowMapper<Address> {

		/**
		 * Copy data about adviser from DB.
		 */
		public Address mapRow(ResultSet rs, int rowNum) throws SQLException {
			Address address = new Address();
			address.setId(rs.getLong(1));
			address.setCountryAddress(rs.getString(2));
			address.setRegionAddress(rs.getString(3));
			address.setCityAddress(rs.getString(4));
			address.setStreetAddress(rs.getString(5));
			address.setBuildAddress(rs.getString(6));

			return address;
		}

	}

	public Address findAddressById(Long id) {
		Address address = jdbc.queryForObject("Select * From ShopCars.Address WHERE ShopCars.Address.id = ?", new workingWithRowMap(), id);
		return address;
	}

	public Collection<Address> findAllAddresses() {
		List<Address> addresses = jdbc.query("SELECT * FROM ShopCars.Address", new workingWithRowMap());
		return addresses;
	}

	public void updateAddress(Address address) {
		jdbc.update("UPDATE ShopCars.Address SET country = '"+
		address.getCountryAddress() + "', region ='"+
		address.getRegionAddress() + "', city ='"+
		address.getCityAddress() + "', street ='" +
		address.getStreetAddress() + "', build ='" +
		address.getBuildAddress() + "' "+
		"WHERE ShopCars.Address.id = " + String.valueOf(address.getId()));
	}

	public void createAddress(AddressRequest addressRequest) {
		jdbc.update(
				"INSERT INTO ShopCars.Address (country, region, city, street, build) values ('" 
						+ addressRequest.getCountryAddress() + "','" 
						+ addressRequest.getRegionAddress()	+ "','" 
						+ addressRequest.getCityAddress() + "','"
						+ addressRequest.getStreetAddress() + "','"
						+ addressRequest.getBuildAddress()+"');");
	}

	public void deleteAddress(Long id) {
		jdbc.update("DELETE FROM ShopCars.Address WHERE ShopCars.Address.id = " + String.valueOf(id));
		
	}
}
