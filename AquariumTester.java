package com.xworkz.copies;

import com.xworkz.copies.constructor.Aquarium;

public class AquariumTester {

	public static void main(String[] args) {
		
		Aquarium aqua=new Aquarium();
		System.out.println(aqua.waterCondition);
		System.out.println(aqua.fish);
		System.out.println(aqua.price);
		System.out.println(aqua.size);
		
		Aquarium aqua0=new Aquarium("normal");
		System.out.println(aqua0.waterCondition);
		
		Aquarium aqua1=new Aquarium(10000);
		System.out.println(aqua1.price);
		
		Aquarium aqua2=new Aquarium("normal","gold fish");
		System.out.println(aqua2.waterCondition);
		System.out.println(aqua2.fish);
		
		Aquarium aqua3=new Aquarium("Basking shark",12);
		System.out.println(aqua3.fish);
		System.out.println(aqua3.size);
	}
	

}