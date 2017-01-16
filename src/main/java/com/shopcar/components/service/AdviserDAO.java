package com.shopcar.components.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.shopcar.components.entity.Adviser;
import com.shopcar.components.entity.request.AdviserRequest;
import com.shopcar.components.interfaces.IAdviser;

@Repository
public class AdviserDAO implements IAdviser{

	@Autowired 
	private JdbcTemplate jdbc;
	
	public static class workingWithRowMap implements RowMapper<Adviser> {

		/**
		 * Copy data about adviser from DB.
		 */
		public Adviser mapRow(ResultSet rs, int rowNum) throws SQLException {
			Adviser adviser = new Adviser();
			adviser.setId(rs.getLong(1));
			adviser.setFnameСonsultant(rs.getString(2));
			adviser.setSnameСonsultant(rs.getString(3));
			adviser.setGenderСonsultant(rs.getBoolean(4));

			return adviser;
		}

	}
	
	public Adviser findAdviserById(Long id) {
		Adviser adviser = jdbc.queryForObject("Select * From ShopCars.Advisers WHERE ShopCars.Advisers.id = ?",
				new workingWithRowMap(), id);
		return adviser;
	}

	public Collection<Adviser> findAllAdvisers() {
		List<Adviser> adviser = jdbc.query("SELECT * FROM ShopCars.Advisers", new workingWithRowMap());
		return adviser;
	}

	public void updateAdviser(Adviser adviser) {
		jdbc.update("UPDATE ShopCars.Advisers SET" + " fname_adviser = " + adviser.getFnameСonsultant()
				+ " sname_adviser = " + adviser.getSnameСonsultant() + " married_adviser = "
				+ String.valueOf(adviser.getMarriedСonsultant()) + " gender_adviser"
				+ String.valueOf(adviser.getGenderСonsultant()) + " WHERE id =" + String.valueOf(adviser.getId()));
	}

	public void createAdviser(AdviserRequest adviseRequest) {
		jdbc.update(
				"INSERT INTO ShopCars.Advisers (fname_adviser, sname_adviser, married_adviser, gender_adviser) "
						+ "values ('" + adviseRequest.getFnameСonsultant() + "','" + adviseRequest.getSnameСonsultant()
						+ "','" + String.valueOf(adviseRequest.getMarriedСonsultant()) + "','"
						+ String.valueOf(adviseRequest.getGenderСonsultant()) + "');");
	}

	public void deleteAdviser(Long id) {
		jdbc.update("DELETE FROM ShopCars.Advisers WHERE ShopCars.Advisers.id = " + String.valueOf(id));
	}
	
}
