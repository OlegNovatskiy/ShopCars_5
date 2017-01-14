package com.shopcar.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shopcar.components.entity.Car;
import com.shopcar.components.entity.request.CarRequest;
import com.shopcar.service.CarService;

@RestController
@Configuration
@RequestMapping("/car")
public class CarController {

	@Autowired
	private CarService carService;

	@RequestMapping("/")
	public String index() {
		return "You are in car!!! Chenge request to some task!!!";
	}

	@RequestMapping(value = "/show/{id}", method = RequestMethod.GET)
	public Car showOneCar(@PathVariable("id") Long id) {
		return carService.findCarById(id);
	}

	@RequestMapping(value = "/show")
	public Collection<Car> showAllCar() {
		return carService.findAllCars();
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String deleteOneCar(@PathVariable("id") Long id) {
		carService.deleteCar(id);
		return "Delete car with id " + String.valueOf(id);
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createCar(@RequestBody CarRequest carRequest) {
		carService.createCar(carRequest);
		return "Car was create";
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public String updateCar(@RequestBody Car car) {
		carService.updateCar(car);		
		return "Car was update: " + String.valueOf(car.getId());
	}

}
