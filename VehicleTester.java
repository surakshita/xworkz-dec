package com.xworkz.copies;

import com.xworkz.copies.constructor.Vehicle;

public class VehicleTester {

	public static void main(String[] args) {
		
		Vehicle vehicle=new Vehicle("tesla","2-dec-2020","5YJ");
		String company=vehicle.getCompany();
		String chassis=vehicle.getChassisNo();
		String date=vehicle.getMfgDate();
		
		
		System.out.println(company);
		System.out.println(chassis);
		System.out.println(date);
		
		String color="black";
		vehicle.setColor(color);
		
		String ownerName="elon";
		vehicle.setOwnerName(ownerName);
		
		
	}

}
