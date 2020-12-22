package com.xworkz.bakery;

import com.xworkz.bakery.cake.Cake;
import com.xworkz.bakery.cake.HoneyCake;

public class TasteTester {

	public static void main(String[] args) {
		
      Cake cake=new Cake();
      cake.setFlavour("red velvet");
      cake.setShape("round");
      cake.setSize(2);
      
      System.out.println(cake.getFlavour());
      System.out.println(cake.getShape());
      System.out.println(cake.getSize());
      
      
      
      cake.taste();//method is called
      
      HoneyCake honeyCake=new HoneyCake();
      System.out.println(honeyCake.getFlavour());
      System.out.println(honeyCake.getShape());
      System.out.println(honeyCake.getSize());
      
      System.out.println(honeyCake.isHoney());
      
      honeyCake.taste();
	}

}
