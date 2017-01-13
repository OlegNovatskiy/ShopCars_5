package com.shopcar.components.entity;

/**
 * @author olegnovatskiy
 *
 * It's class is entity of Car that will use in Services. It has three property: id, name, model, engine.
 *
 */
public class Car {
	
	private Long id;
	private String nameCar;
	private String modelCar;
	private Float engineCar;

	public Car() {}

	/**
	 * It's constructor for create an object of class Car.
	 * @param nameCar
	 * @param modelCar
	 * @param engineCar
	 */
	public Car(String nameCar, String modelCar, Float engineCar) {
		this.nameCar = nameCar;
		this.modelCar = modelCar;
		this.engineCar = engineCar;
	}
	
	public void setId(Long Id){
		this.id = Id;
	}
	public void setNameCar(String nameCar){
		this.nameCar = nameCar;
	}
	public void setModelCar(String modelCar){
		this.modelCar = modelCar;
	}
	public void setEngineCar(Float engineCar){
		this.engineCar = engineCar;
	}
	public Long getId(){
			return this.id;
	}
	public String getNameCar(){
			return this.nameCar;
	}
	public String getModelCar(){
		return this.modelCar;
	}
	public Float getEngineCar(){
		return this.engineCar;
	}
	
	/**
	 * It's method will create and return an variable of string, that will include info about it car.
	 */
	@Override
	public String toString(){
		return "name = " + this.nameCar + ", model = " + this.modelCar + ", engine = " + String.valueOf(this.engineCar);
	}
	
}
