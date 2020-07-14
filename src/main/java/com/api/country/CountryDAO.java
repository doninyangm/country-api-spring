package com.api.country;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CountryDAO {
	
	private static List<Country> countries = new ArrayList<>();
	private static int countryCount = 3;
	
	static {
		countries.add(new Country("Nigeria", "NG", "NGI", "Africa", "Abuja", "naira", 120000));
		countries.add(new Country("England", "EG", "EGL", "Europe", "London", "pound", 73738383));
		countries.add(new Country("America", "US", "USA", "America", "Washinton DC", "dollae", 378393930));
	}
	
	public List<Country> findAll(){
		return countries;
	}
	
	public Country save(Country country) {
		if(country.getId() == null) {
			country.setId(++countryCount);
		}
		countries.add(country);
		return country; 
	}
	
	public Country findOne(int id) {
		for(Country user:countries) { 
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}
	
	public Country deleteOne(int id) {
		Iterator<Country> iterator = countries.iterator();
		while(iterator.hasNext()) {
			Country user = iterator.next();
			if(user.getId() == id) {
				iterator.remove();
				return user;
			}
		}
		return null;
	}
}
