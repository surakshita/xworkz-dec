package com.xworkz.cafecoffeeday.applicances;

public class CoffeeMachine {

	private Power power;

	public CoffeeMachine() {
		System.out.println("invoked constructor");
	}

	public CoffeeMachine(Power power) {
		System.out.println("invoked coffee machine");
		this.power = power;
	}

	public boolean grindCoffee(String beans) {
		System.out.println("invoked grindCoffee");
		if (beans != null) {
			boolean generated = this.power.generatePower();
			if (generated) {
				System.out.println("grinding can be done");
				return true;
			} else {
				System.out.println("voltage is high grinding cannot be done");
				return false;
			}
		} else {
			System.out.println("no beans are found");
			return false;
		}
	}
}
