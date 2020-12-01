package com.xworkz.copies.constructor;

public class Season {

	public String name;
	public String startMonth;
	
	
	public Season()
	{
		System.out.println("invoked default constructor");
	}
	
	public Season(String name,String startMonth) {
		
		System.out.println("invoked season constructor with two para ");
		this.name=name;
		this.startMonth=startMonth;
	}
}
