package com.shopcar.components.entity.request;

/*
 * It'a class use for create customer by Users in UI.
 */

public class CustomerRequest {

	private String fnameCustomer;
	private String snameCustomer;
	private Boolean marriedCustomer;
	private Boolean genderCustomer;

	public String getFnameCustomer() {
		return fnameCustomer;
	}

	public void setFnameCustomer(String fnameCustomer) {
		this.fnameCustomer = fnameCustomer;
	}

	public String getSnameCustomer() {
		return snameCustomer;
	}

	public void setSnameCustomer(String snameCustomer) {
		this.snameCustomer = snameCustomer;
	}

	public Boolean getMarriedCustomer() {
		return marriedCustomer;
	}

	public void setMarriedCustomer(Boolean marriedCustomer) {
		this.marriedCustomer = marriedCustomer;
	}

	public Boolean getGenderCustomer() {
		return genderCustomer;
	}

	public void setGenderCustomer(Boolean genderCustomer) {
		this.genderCustomer = genderCustomer;
	}
	
}
