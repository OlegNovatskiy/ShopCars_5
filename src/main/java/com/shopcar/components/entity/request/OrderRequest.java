package com.shopcar.components.entity.request;

import java.sql.Date;

/*
 * It'a class use for create order by Users in UI.
 */

public class OrderRequest {

	private Long idCar;
	private Long idSeller;
	private Long idCustomer;
	private Long idAddress;
	private Date dateOrder;

	public Long getIdCar() {
		return idCar;
	}

	public void setIdCar(Long idCar) {
		this.idCar = idCar;
	}

	public Long getIdSeller() {
		return idSeller;
	}

	public void setIdSeller(Long idSeller) {
		this.idSeller = idSeller;
	}

	public Long getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(Long idCustomer) {
		this.idCustomer = idCustomer;
	}

	public Long getIdAddress() {
		return idAddress;
	}

	public void setIdAddress(Long idAddress) {
		this.idAddress = idAddress;
	}

	public Date getDateOrder() {
		return dateOrder;
	}

	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}

}
