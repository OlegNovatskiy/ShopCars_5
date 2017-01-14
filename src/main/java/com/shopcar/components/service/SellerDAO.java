package com.shopcar.components.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.shopcar.components.entity.Seller;
import com.shopcar.components.entity.request.SellerRequest;
import com.shopcar.components.interfaces.ISeller;

@Repository
public class SellerDAO implements ISeller {

	@Autowired
	private JdbcTemplate jdbc;

	public static class workingWithRowMap implements RowMapper<Seller> {

		/**
		 * Copy data about car from DB.
		 */
		public Seller mapRow(ResultSet rs, int rowNum) throws SQLException {
			Seller seller = new Seller();
			seller.setId(rs.getLong(1));
			seller.setFnameSeller(rs.getString(2));
			seller.setSnameSeller(rs.getString(3));
			seller.setGenderSeller(rs.getBoolean(4));

			return seller;
		}

	}

	public Seller findSellerById(Long id) {
		Seller cutomer = jdbc.queryForObject("Select * From ShopCars.Seller WHERE ShopCars.Seller.id = ?",
				new workingWithRowMap(), id);
		return cutomer;
	}

	public Collection<Seller> findAllSellers() {
		List<Seller> seller = jdbc.query("SELECT * FROM ShopCars.Seller", new workingWithRowMap());
		return seller;
	}

	public void updateSeller(Seller seller) {
		jdbc.update("UPDATE ShopCars.Seller SET" + " fname_seller = " + seller.getFnameSeller() + " sname_seller = "
				+ seller.getSnameSeller() + " married_seller = " + String.valueOf(seller.getMarriedSeller())
				+ " gender_seller" + String.valueOf(seller.getGenderSeller()) + " WHERE ShopCars.Seller.id ="
				+ String.valueOf(seller.getId()));
	}

	public void createSeller(SellerRequest sellerRequest) {
		jdbc.update("INSERT INTO ShopCars.Customers (fname_seller, sname_seller, married_seller, gender_seller) "
				+ "values ('" + sellerRequest.getFnameSeller() + "','" + sellerRequest.getSnameSeller() + "','"
				+ String.valueOf(sellerRequest.getMarriedSeller()) + "','"
				+ String.valueOf(sellerRequest.getGenderSeller()) + "');");
	}

	public void deleteSeller(Long id) {
		jdbc.update("DELETE FROM ShopCars.Seller WHERE ShopCars.Seller.id = " + String.valueOf(id));
	}
}
