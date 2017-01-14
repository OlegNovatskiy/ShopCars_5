package com.shopcar.components.interfaces;

import java.util.Collection;

import com.shopcar.components.entity.Seller;
import com.shopcar.components.entity.request.SellerRequest;

public interface ISeller {
	public Seller findSellerkById(Long id);

	public Collection<Seller> findAllSellers();

	public void createSeller(SellerRequest sellerRequest);

	public void updateSeller(Seller eller);

	public void deleteSeller(Long id);
}
