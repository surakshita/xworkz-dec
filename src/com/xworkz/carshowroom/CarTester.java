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

		CarShowroom carShowroom = new CarShowroom();
		CarDTO dto = new CarDTO();

		dto.setModel("lamborgini");
		dto.setVariant(CarVariant.BASE);
		dto.setPrice(90000000);

		carShowroom.addCars(dto);

		CarDTO dto2 = new CarDTO("jeep", 850000, CarVariant.BASE);
		carShowroom.addCars(dto2);

		CarDTO dto3 = new CarDTO("swift", 600000, CarVariant.TOP);
		carShowroom.addCars(dto3);

		CarDTO dto4 = new CarDTO("telsa", 8947777, CarVariant.BASE);
		carShowroom.addCars(dto4);

		carShowroom.displayCars();
		System.out.println("******************");
		carShowroom.updateCarVariant(CarVariant.TOP, 1);
		// carShowroom.displayCars();
		carShowroom.displayCarAtIndex(1);

	}

}
