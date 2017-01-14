package com.shopcar.components.interfaces;

import java.util.Collection;

import com.shopcar.components.entity.Adviser;
import com.shopcar.components.entity.request.AdviserRequest;

public interface IAdviser {
	
	public Adviser findAdviserById(Long id);
	
	public Collection<Adviser> findAllAdvisers();
	
	public void createAdviser(AdviserRequest adviserRequest);
	
	public void updateAdviser(Adviser adviser);

	public void deleteAdviser(Long id);
}
