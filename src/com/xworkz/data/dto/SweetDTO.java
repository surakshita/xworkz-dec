package com.xworkz.data.dto;

import com.xworkz.data.constants.Shape;

import com.xworkz.data.constants.Color;

public class SweetDTO {

	private String name;
	private int price;
	private String popularState;
	private Color colors;
	private int quantity;
	private Shape shape;

	public SweetDTO() {
		System.out.println("created");
	}

	public SweetDTO(String name, int price, String popularState) {
		super();
		this.name = name;
		this.price = price;
		this.popularState = popularState;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPopularState() {
		return popularState;
	}

	public void setPopularState(String popularState) {
		this.popularState = popularState;
	}

	public Color getColors() {
		return colors;
	}

	public void setColors(Color colors) {
		this.colors = colors;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

}
