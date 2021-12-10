package com.example.electric.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.electric.model.City;

@RestController
public class ElocatorController {
	Logger logger = LoggerFactory.getLogger(ElocatorController.class);
	
	@Autowired
	private City city;

	@GetMapping(value="/city/{pwd}", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<City> getCity(@PathVariable("pwd") String pwd){
		logger.debug("Debug controller");
		if(pwd.equalsIgnoreCase("123")) {
			logger.info("IllegalStateException");
			
			throw new IllegalStateException("Password is wrong");
		}
		logger.info("City" + city.getUrl() +" " + city.getPassword());
		return new ResponseEntity<City>(city, HttpStatus.ACCEPTED);
	}
}
