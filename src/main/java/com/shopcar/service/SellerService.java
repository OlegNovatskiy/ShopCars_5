package com.shopcar.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopcar.components.entity.Seller;
import com.shopcar.components.entity.request.SellerRequest;
import com.shopcar.components.interfaces.ISeller;

@Service
public class SellerService {

	@Autowired
	private ISeller iSeller;
	
	public Seller findSellerById(Long id){
		return iSeller.findSellerById(id);
	}
	
	public Collection<Seller> findAllCustomerses(){
		return iSeller.findAllSellers();
	}
	
	public void deleteSeller(Long id){
		iSeller.deleteSeller(id);
	}
	
	public void createSeller(SellerRequest sellerRequest){
		iSeller.createSeller(sellerRequest);
	}
	
	public void updateSeller(Seller seller){
		iSeller.updateSeller(seller);
	}
	
}
