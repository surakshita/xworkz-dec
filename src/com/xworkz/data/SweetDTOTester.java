package com.xworkz.data;

import com.xworkz.data.constants.Color;
import com.xworkz.data.constants.Shape;
import com.xworkz.data.dto.SweetDTO;

public class SweetDTOTester {

	public static void main(String[] args) {

		SweetDTO sweet = new SweetDTO("mysurpark", 200, "karnataka");
		sweet.setShape(Shape.RECTANGLE);
		sweet.setColors(Color.WHITE);

		System.out.println(sweet.getName());
		System.out.println(sweet.getPrice());
		System.out.println(sweet.getPopularState());
		System.out.println(sweet.getColors());
		System.out.println(sweet.getShape());

		SweetDTO sweet1 = new SweetDTO("ladoo", 300, "tirupathi");
		sweet1.setColors(Color.YELLOW);
		sweet1.setShape(Shape.ROUND);

		System.out.println(sweet.getName());
		System.out.println(sweet.getPrice());
		System.out.println(sweet.getPopularState());
		System.out.println(sweet.getColors());
		System.out.println(sweet.getShape());
		
		SweetDTO sweet2 = new SweetDTO("khaja", 487, "bihar");
		sweet2.setColors(Color.ORANGE);
		sweet2.setShape(Shape.RECTANGLE);

		System.out.println(sweet2.getName());
		System.out.println(sweet2.getPrice());
		System.out.println(sweet2.getPopularState());
		System.out.println(sweet2.getColors());
		System.out.println(sweet2.getShape());


	}

}
