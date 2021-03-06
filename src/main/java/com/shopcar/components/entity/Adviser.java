package com.shopcar.components.entity;

/*
 * It'a class use for work with Adviser in service.
 */

public class Adviser {

	private Long id;
	private String fnameСonsultant;
	private String snameСonsultant;
	private Boolean marriedСonsultant;
	private Boolean genderСonsultant;

	public Adviser() {
	}

	/**
	 * It's constructor for create an object of class Adviser.
	 * 
	 * @param fnameСonsultant
	 * @param snameСonsultant
	 * @param marriedСonsultant
	 * @param genderСonsultant
	 */
	public Adviser(String fnameСonsultant, String snameСonsultant, Boolean marriedСonsultant,
			Boolean genderСonsultant) {
		this.fnameСonsultant = fnameСonsultant;
		this.snameСonsultant = snameСonsultant;
		this.marriedСonsultant = marriedСonsultant;
		this.genderСonsultant = genderСonsultant;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
