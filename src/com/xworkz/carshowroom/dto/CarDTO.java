package com.xworkz.carshowroom.dto;

import com.xworkz.carshowroom.constants.CarVariant;

public class CarDTO {

	String model;
	double price;
	CarVariant variant;

	public CarDTO() {

		System.out.println("cardto constructor");
	}

	/**
	 * 
	 * @param model
	 * @param price
	 * @param variant
	 */
	public CarDTO(String model, double price, CarVariant variant) {
		super();
		this.model = model;
		this.price = price;
		this.variant = variant;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public CarVariant getVariant() {
		return variant;
	}

	public void setVariant(CarVariant variant) {
		this.variant = variant;
	}

}
