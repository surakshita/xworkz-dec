package com.xworkz.copies;

import com.xworkz.copies.constructor.Temple;

public class TempleTester {

	public static void main(String[] args) {
		
		Temple temple=new Temple("hanuman","gulbarga",6.00f,"lado",8.00f);
		
		String name=temple.getName();
		String location=temple.getLocation();
		float start=temple.getOpenTime();
		String prasada=temple.getPrasada();
		float close=temple.getCloseTime();
		
		System.out.println(name);
		System.out.println(location);
		System.out.println(start);
		System.out.println(prasada);
		System.out.println(close);
		
		//to update use setter 
		temple.setPrasada("pulivagre");
		prasada=temple.getPrasada();
		System.out.println("updated prasada:"+prasada);
	}

}
