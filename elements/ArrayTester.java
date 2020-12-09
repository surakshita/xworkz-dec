package com.xworkz.elements;

import java.util.Arrays;

import com.xworkz.elements.bookmovie.Customer;

public class ArrayTester {

	public static void main(String[] args) {
		String[] colorName= {"red","blue","green","white","black"};
		System.out.println(colorName.length);
		
		//indexed value are fixed i.e, array value r fixed
		
		String index0=colorName[1];
		System.out.println(index0);
		
		//index or string values can be changed
		
		colorName[1]="purple";
		System.out.println(colorName[1]);
		//used to view the list of array
		System.out.println(Arrays.toString(colorName));
		//instance memory located in heap
		Customer customer=new Customer();
		String name=customer.getName();
		name="xworkz";
		System.out.println(name);
		customer.setName("banglore");
		System.out.println(customer.getName());
		
	}

}
