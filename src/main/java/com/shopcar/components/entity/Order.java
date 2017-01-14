package com.shopcar.components.entity;

import java.sql.Date;

/*
 * It'a class use for work with order in service.
 */

public class Order {

	private Long id;
	private Long idCar;
	private Long idSeller;
	private Long idCustomer;
	private Long idAddress;
	private Date dateOrder;
	
	public Order(){}
	/**
	 * It's constructor for create new object of class order.
	 * @param idCar
	 * @param idSeller
	 * @param idCustomer
	 * @param idAddress
	 * @param dateOrder
	 */
	public Order(Long idCar, Long idSeller, Long idCustomer, Long idAddress, Date dateOrder){
		this.idCar = idCar;
		this.idSeller = idSeller;
		this.idCustomer = idCustomer;
		this.idAddress = idAddress;
		this.dateOrder = dateOrder;
	}	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
