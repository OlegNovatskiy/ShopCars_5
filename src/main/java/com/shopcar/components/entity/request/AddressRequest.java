package com.shopcar.components.entity.request;

/*
 * It'a class use for create address by Users in UI.
 */

public class AddressRequest {

	private String countryAddress;
	private String regionAddress;
	private String cityAddress;
	private String streetAddress;
	private String buildAddress;

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
