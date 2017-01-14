package com.shopcar.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopcar.components.entity.Car;
import com.shopcar.components.entity.request.CarRequest;
import com.shopcar.components.interfaces.ICar;

@Service
public class CarService {

	@Autowired
	private ICar iCar;
	
	public Car findCarById(Long id){
		return iCar.findCarById(id);
	}
	
	public Collection<Car> findAllCars(){
		return iCar.findAllCars();
	}
	
	public void deleteCar(Long id){
		iCar.deleteCar(id);
	}
	
	public void createCar(CarRequest carRequest){
		iCar.createCar(carRequest);
	}
	
	public void updateCar(Car car){
		iCar.updateCar(car);
	}
	
}
