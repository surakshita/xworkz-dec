package com.xworkz.sports;

import com.xworkz.sports.constants.FootWearType;
import com.xworkz.sports.footwear.Discount;

public class FootWearTester {

	public static void main(String[] args) {
		

		
		
		Discount dis=new Discount();
		dis.setBrand("PUMA");
		dis.setFootWearType(FootWearType.SPORTS);
		dis.setPrice(4500);
		dis.setSize(7);
		
		dis.details();
		
		double dis1=dis.discountPrice();
		System.out.println("discount:"+dis1);
	}

}
