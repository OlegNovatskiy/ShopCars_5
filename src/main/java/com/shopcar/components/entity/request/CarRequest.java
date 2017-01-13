package com.shopcar.components.entity.request;

/*
 * It'a class use for create car by Users in UI.
 */

public class CarRequest {

	private String nameCar;
	private String modelCar;
	private Float engineCar;

	public String getNameCar() {
		return nameCar;
	}

	public void setNameCar(String nameCar) {
		this.nameCar = nameCar;
	}

	public String getModelCar() {
		return modelCar;
	}

	public void setModelCar(String modelCar) {
		this.modelCar = modelCar;
	}

	public Float getEngineCar() {
		return engineCar;
	}

	public void setEngineCar(Float engineCar) {
		this.engineCar = engineCar;
	}

	/**
	 * It's method will create and return an variable of string, that will include info about it car.
	 */
	@Override
	public String toString() {
		return "name = " + this.nameCar + ", model = " + this.modelCar + ", engine = " + String.valueOf(this.engineCar);
	}

}
