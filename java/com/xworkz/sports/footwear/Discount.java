package com.xworkz.sports.footwear;

public class Discount extends FootWear {
	
	public double discountPrice()
	{
		double price=super.getPrice();
		double discount=0;
		if(price>=1000)
		{
			discount=100;
		}
		if(price>=2000)
		{
			discount=200;
		}
		return discount;
	}

}
