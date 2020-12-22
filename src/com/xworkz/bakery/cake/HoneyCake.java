package com.xworkz.bakery.cake;

public class HoneyCake extends Cake {

	private boolean honey;

	public void setHoney(boolean honey) {
		System.out.println("invoked honey method");
		this.honey = honey;
	}

	public boolean isHoney() {
		return honey;
	}

}
