package com.shopcar.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopcar.components.entity.Adviser;
import com.shopcar.components.entity.request.AdviserRequest;
import com.shopcar.components.interfaces.IAdviser;

@Service
public class AdviserService {
	
	@Autowired
	private IAdviser iAdviser;
	
	public Adviser findAdviserById(Long id){
		return iAdviser.findAdviserById(id);
	}
	
	public Collection<Adviser> findAllAdvisers(){
		return iAdviser.findAllAdvisers();
	}
	
	public void deleteAdviser(Long id){
		iAdviser.deleteAdviser(id);
	}
	
	public void createAdviser(AdviserRequest adviserRequest){
		iAdviser.createAdviser(adviserRequest);
	}
	
	public void updateAdviser(Adviser adviser){
		iAdviser.updateAdviser(adviser);
	}
}
