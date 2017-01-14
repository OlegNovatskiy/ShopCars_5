package com.shopcar.components.entity;

/*
 * It'a class use for work with seller in service.
 */

public class Seller {

	private Long id;
	private String fnameSeller;
	private String snameSeller;
	private Boolean marriedSeller;
	private Boolean genderSeller;

	public Seller() {
	}

	/**
	 * It's constructor for create an object of class Seller.
	 * 
	 * @param fnameSeller
	 * @param snameSeller
	 * @param marriedSeller
	 * @param genderSeller
	 */
	public Seller(String fnameSeller, String snameSeller, Boolean marriedSeller, Boolean genderSeller) {
		this.fnameSeller = fnameSeller;
		this.snameSeller = snameSeller;
		this.marriedSeller = marriedSeller;
		this.genderSeller = genderSeller;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFnameSeller() {
		return fnameSeller;
	}

	public void setFnameSeller(String fnameSeller) {
		this.fnameSeller = fnameSeller;
	}

	public String getSnameSeller() {
		return snameSeller;
	}

	public void setSnameSeller(String snameSeller) {
		this.snameSeller = snameSeller;
	}

	public Boolean getMarriedSeller() {
		return marriedSeller;
	}

	public void setMarriedSeller(Boolean marriedSeller) {
		this.marriedSeller = marriedSeller;
	}

	public Boolean getGenderSeller() {
		return genderSeller;
	}

	public void setGenderSeller(Boolean genderSeller) {
		this.genderSeller = genderSeller;
	}
	
}
