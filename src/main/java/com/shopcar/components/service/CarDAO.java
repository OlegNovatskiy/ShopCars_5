package com.shopcar.components.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.shopcar.components.entity.Car;
import com.shopcar.components.entity.request.CarRequest;
import com.shopcar.components.interfaces.ICar;

@Repository
public class CarDAO implements ICar {

	@Autowired
	private JdbcTemplate jdbc;

	public static class workingWithRowMap implements RowMapper<Car> {

		/**
		 * Copy data about car from DB.
		 */
		public Car mapRow(ResultSet rs, int rowNum) throws SQLException {
			Car car = new Car();
			car.setId(rs.getLong(1));
			car.setNameCar(rs.getString(2));
			car.setModelCar(rs.getString(3));
			car.setEngineCar(rs.getFloat(4));

			return car;
		}

	}

	/**
	 * 
	 * It's method that will find Car with specify id.
	 * 
	 * @param id
	 * @return
	 */
	public Car findCarById(Long id) {
		final String SQL = "SELECT * FROM Cars WHERE Cars.id = ?";
		Car car = jdbc.queryForObject(SQL, new workingWithRowMap(), id);
		return car;
	}

	/**
	 * It's method will find all cars.
	 */
	public Collection<Car> findAllCars() {

		final String SQL = "SELECT * FROM Cars";
		List<Car> cars = jdbc.query(SQL, new workingWithRowMap());
		return cars;
	}

	public void deleteCar(Long id) {
		final String SQL = "Delete FROM Cars WHERE id = ?";
		jdbc.update(SQL, id);
	}

	public void createCar(CarRequest carRequest) {
		final String SQL = "INSERT INTO Cars (name_car, model_car, engine_car) VALUES ('" + carRequest.getNameCar()
				+ "', '" + carRequest.getModelCar() + "', " + String.valueOf(carRequest.getEngineCar()) + ");";
		jdbc.update(SQL);
	}

	public void updateCar(Car car) {
		final String SQL = "UPDATE Cars SET  name_car = '" + car.getNameCar() + "', model_car = '" + car.getModelCar()
				+ "', engine_car = " + String.valueOf(car.getEngineCar()) + " WHERE id = " + car.getId() + ";";
		jdbc.update(SQL);
	}

}
