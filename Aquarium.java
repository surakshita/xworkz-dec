package com.xworkz.copies.constructor;

public class Aquarium {
	
	public String waterCondition;
	public String fish;
	public int size;
	public int price;
	
	
	public Aquarium() {
		System.out.println("invoked default constructor");
		
	}
	
	public Aquarium(String waterCondition) {
		System.out.println("invoked constructor with one para string type");
		this.waterCondition=waterCondition;
		
	}
	public Aquarium(String waterCondition,String fish)
	{
		System.out.println("invoked constructor with two para string type");
        this.waterCondition=waterCondition;
    	this.fish=fish;
	}
	public Aquarium(String fish,int size) {
		System.out.println("invoked constructor with two para one string & another int type");
		this.fish=fish;
		this.size=size;
		
	}
	public Aquarium(int price) {
		System.out.println("invoked constructor with one para int type");
		this.price=price;
		
	}

}
