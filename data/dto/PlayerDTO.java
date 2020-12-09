package com.xworkz.data.dto;

public class PlayerDTO {
	private String name;
	private String[] sports;
	private String country;
	private String[] awards= {"best player in hockey","t20 final award","most goals award in football"};
	
	
	public PlayerDTO()
	{
		System.out.println("created player");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getSports() {
		return sports;
	}
	public void setSports(String[] sports) {
		this.sports = sports;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String[] getAwards() {
		return awards;
	}
	public void setAwards(String[] awards) {
		this.awards = awards;
	}
	
	
}
