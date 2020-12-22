package com.xworkz.bakery.cake;

public class Cake {

	private String flavour;
	private double size;
	private String shape;

	// method
	public boolean taste() {
		System.out.println("taste method is invoked");
		boolean tastesGood = true;
		return tastesGood;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

}
