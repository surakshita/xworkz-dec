package com.xworkz.carshowroom;

import com.xworkz.carshowroom.constants.CarVariant;
import com.xworkz.carshowroom.dto.CarDTO;
import com.xworkz.carshowroom.showroom.CarShowroom;

public class CarTester {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		CarShowroom car = new CarShowroom();
		CarDTO dto = new CarDTO();
		car.addCars(dto);
		dto.setModel("BMW");
		System.out.println("model name:" + dto.getModel());
		dto.setPrice(9000000);
		System.out.println("price:" + dto.getPrice());
		dto.setVariant(CarVariant.BASE);
		System.out.println("variant:" + dto.getVariant());

		CarDTO dto1 = new CarDTO("Tesla", 600000, CarVariant.TOP);
		car.addCars(dto1);
		System.out.println("model name:" + dto1.getModel());
		System.out.println("price:" + dto1.getPrice());
		System.out.println("variant:" + dto1.getVariant());

		CarDTO dto2 = new CarDTO("swift", 300000, CarVariant.BASE);
		car.addCars(dto2);
		System.out.println("model name:" + dto2.getModel());
		System.out.println("price:" + dto2.getPrice());
		System.out.println("variant:" + dto2.getVariant());

		CarDTO dto3 = new CarDTO("jeep", 900000, CarVariant.TOP);
		car.addCars(dto3);
		System.out.println("model name:" + dto3.getModel());
		System.out.println("price:" + dto3.getPrice());
		System.out.println("variant:" + dto3.getVariant());
	}

}
