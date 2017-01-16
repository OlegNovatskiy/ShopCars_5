package com.shopcar.components.entity.request;

/*
 * It'a class use for create consultant by Users in UI.
 */

public class AdviserRequest {

	private String fnameСonsultant;
	private String snameСonsultant;
	private Boolean marriedСonsultant;
	private Boolean genderСonsultant;

	public String getFnameСonsultant() {
		return fnameСonsultant;
	}

	public void setFnameСonsultant(String fnameСonsultant) {
		this.fnameСonsultant = fnameСonsultant;
	}

	public String getSnameСonsultant() {
		return snameСonsultant;
	}

	public void setSnameСonsultant(String snameСonsultant) {
		this.snameСonsultant = snameСonsultant;
	}

	public Boolean getMarriedСonsultant() {
		return marriedСonsultant;
	}

	public void setMarriedСonsultant(Boolean marriedСonsultant) {
		this.marriedСonsultant = marriedСonsultant;
	}

	public Boolean getGenderСonsultant() {
		return genderСonsultant;
	}

	public void setGenderСonsultant(Boolean genderСonsultant) {
		this.genderСonsultant = genderСonsultant;
	}
}
