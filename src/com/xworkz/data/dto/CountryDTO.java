package com.xworkz.data.dto;

public class CountryDTO {

	private String name;
	private String continent;
	private String[] states;
	private int population;
	private String primeMinister;
	private String president;
	private String[] lanuages;

	public CountryDTO() {
		System.out.println("first constructor");

	}

	public CountryDTO(String name, String continent) {
		System.out.println("second constructor with two para");
		this.name = name;
		this.continent = continent;

	}

	public CountryDTO(String[] states, int population) {
		System.out.println("third constructor with two para one is string and int");
		this.states = states;
		this.population = population;

	}

	public CountryDTO(String primeMinister, String[] lanuages) {
		System.out.println("fourth constructor with string and array of string");
		this.primeMinister = primeMinister;
		this.lanuages = lanuages;
	}

	public CountryDTO(String president) {
		System.out.println("fifth constructor with single string para");
		this.president = president;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String[] getStates() {
		return states;
	}

	public void setStates(String[] states) {
		this.states = states;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getPrimeMinister() {
		return primeMinister;
	}

	public void setPrimeMinister(String primeMinister) {
		this.primeMinister = primeMinister;
	}

	public String getPresident() {
		return president;
	}

	public void setPresident(String president) {
		this.president = president;
	}

	public String[] getLanuages() {
		return lanuages;
	}

	public void setLanuages(String[] lanuages) {
		this.lanuages = lanuages;
	}

}
