package com.api.country;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
	
	@Autowired
	private CountryDAO service;
	
	@GetMapping("/")
	public List<Country> index() {
		return service.findAll();
	}

}
