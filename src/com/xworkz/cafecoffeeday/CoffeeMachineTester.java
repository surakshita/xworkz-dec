package com.xworkz.cafecoffeeday;

import com.xworkz.cafecoffeeday.applicances.CoffeeMachine;

import com.xworkz.cafecoffeeday.applicances.Power;

public class CoffeeMachineTester {

	public static void main(String[] args) {

		CoffeeMachine machine = new CoffeeMachine(new Power());

		boolean success = machine.grindCoffee("Civet");
		if (success) {
			System.out.println("grinding is in process");

		} else {
			System.out.println("grinding is not done");

		}

	}

}
