package com.api.country;

public class Country {
	private int id;
	private String name, ISO2, ISO3, continent, capital, currency, population;
	
	public Country(String name, String iSO2, String iSO3, String continent, String capital, String currency,
			String population) {
		super();
		this.name = name;
		ISO2 = iSO2;
		ISO3 = iSO3;
		this.continent = continent;
		this.capital = capital;
		this.currency = currency;
		this.population = population;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getISO2() {
		return ISO2;
	}

	public void setISO2(String iSO2) {
		ISO2 = iSO2;
	}

	public String getISO3() {
		return ISO3;
	}

	public void setISO3(String iSO3) {
		ISO3 = iSO3;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}
	
	
}
