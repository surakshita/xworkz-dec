package com.xworkz.cafecoffeeday.applicances;

public class Power {

	private int voltage = 0;

	public Power() {
		System.out.println("invoked power constructor");
	}

	public boolean generatePower() {
		this.voltage = 250;
		return true;

	}

}
