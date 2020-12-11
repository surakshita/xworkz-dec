package com.xworkz.data.dto;

public class MobileDTO {
	
	private String brand;
	private int price;
	private String color;
	private String model;
	private int ram;
	private String country;
	private String device;
	private String voiceAssistant;
	
	public MobileDTO(String brand,int price,String color,String model,int ram,String country,String device,String voiceAssistant)
	{
		System.out.println("created constructor");
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.country=country;
		this.model=model;
		this.ram=ram;
		this.device=device;
		this.voiceAssistant=voiceAssistant;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public String getVoiceAssistant() {
		return voiceAssistant;
	}

	public void setVoiceAssistant(String voiceAssistant) {
		this.voiceAssistant = voiceAssistant;
	}
	
	

}
