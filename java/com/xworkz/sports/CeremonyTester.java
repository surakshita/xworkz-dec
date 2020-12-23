package com.xworkz.sports;

import com.xworkz.sports.award.Ceremony;

public class CeremonyTester {

	public static void main(String[] args) {
		
		Ceremony ceremony=new Ceremony("national sports");
		
		String[] foodList= {"samosa","ice-cream","cold-drinks"};
		
		ceremony.setFoods(foodList);
		
		ceremony.distributeAward("ram", "runnig race 100m");
		
		ceremony.displayFood();
		
		//ceremony.displayCeremonyAndFood();
		ceremony.parentMember();
	}

}
