package com.shopcar.components.interfaces;

import java.util.Collection;

import com.shopcar.components.entity.Car;
import com.shopcar.components.entity.request.CarRequest;

public interface ICar {
	
	public Car findCarById(Long id);
	
	public Collection<Car> findAllCars();
	
	public void createCar(CarRequest carRequest);
	
	public void updateCar(Car car);
	
	public void deleteCar(Long id);
	
}
