package com.shopcar.components.entity.request;

/*
 * It'a class use for create Seller by Users in UI.
 */

public class SellerRequest {

	private String fnameSeller;
	private String snameSeller;
	private Boolean marriedSeller;
	private Boolean genderSeller;

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
