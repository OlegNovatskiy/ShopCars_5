package com.shopcar.components.entity;

/*
 * It'a class use for work with Customer in service.
 */

public class Customer {

	private Long id;
	private String fnameCustomer;
	private String snameCustomer;
	private Boolean marriedCustomer;
	private Boolean genderCustomer;

	public Customer() {
	}

	/**
	 * It's constructor for create an object of class Customer.
	 * 
	 * @param fnameSeller
	 * @param snameSeller
	 * @param marriedSeller
	 * @param genderSeller
	 */
	public Customer(String fnameCustomer, String snameCustomer, Boolean marriedCustomer, Boolean genderCustomer) {
		this.fnameCustomer = fnameCustomer;
		this.snameCustomer = snameCustomer;
		this.marriedCustomer = marriedCustomer;
		this.genderCustomer = genderCustomer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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