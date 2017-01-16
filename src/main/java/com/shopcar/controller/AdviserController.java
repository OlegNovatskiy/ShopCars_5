package com.shopcar.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shopcar.components.entity.Adviser;
import com.shopcar.components.entity.request.AdviserRequest;
import com.shopcar.service.AdviserService;

@Configuration
@RestController
@RequestMapping(value = "/adviser")
public class AdviserController {
	
	@Autowired
	private AdviserService adviserService;
	

	@RequestMapping(value = "/show/{id}", method = RequestMethod.GET)
	public Adviser showOneAdviser(@PathVariable("id") Long id) {
		return adviserService.findAdviserById(id);
	}
	
	@RequestMapping(value = "/show", method  = RequestMethod.GET)
	public Collection<Adviser> showAllAdvisers(){
		return adviserService.findAllAdvisers();
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public void createAdviser(@RequestBody AdviserRequest adviserRequest){
		adviserService.createAdviser(adviserRequest);
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String deleteOneAdviser(@PathVariable("id") Long id) {
		adviserService.deleteAdviser(id);
		return "Delete adviser with id " + String.valueOf(id);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public String updateAdviser(@RequestBody Adviser adviser) {
		adviserService.updateAdviser(adviser);		
		return "adviser was update: " + String.valueOf(adviser.getId());
	}
	
}
