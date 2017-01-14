package com.shopcar.components.entity;

/**
 * 
 * @author olegnovatskiy
 *
 *         It's class for address.
 */

public class Address {

	private Long id;
	private String countryAddress;
	private String regionAddress;
	private String cityAddress;
	private String streetAddress;
	private String buildAddress;

	public Address() {
	}

	/**
	 * It's constructor for create an object of class Address.
	 * 
	 * @param countryAddress
	 * @param regionAddress
	 * @param cityAddress
	 * @param streetAddress
	 * @param buildAddress
	 */
	public Address(String countryAddress, String regionAddress, String cityAddress, String streetAddress,
			String buildAddress) {
		this.countryAddress = countryAddress;
		this.regionAddress = regionAddress;
		this.cityAddress = cityAddress;
		this.streetAddress = streetAddress;
		this.buildAddress = buildAddress;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCountryAddress() {
		return countryAddress;
	}

	public void setCountryAddress(String countryAddress) {
		this.countryAddress = countryAddress;
	}

	public String getRegionAddress() {
		return regionAddress;
	}

	public void setRegionAddress(String regionAddress) {
		this.regionAddress = regionAddress;
	}

	public String getCityAddress() {
		return cityAddress;
	}

	public void setCityAddress(String cityAddress) {
		this.cityAddress = cityAddress;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getBuildAddress() {
		return buildAddress;
	}

	public void setBuildAddress(String buildAddress) {
		this.buildAddress = buildAddress;
	}

}
