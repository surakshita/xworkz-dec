package com.xworkz.carshowroom;

import com.xworkz.carshowroom.dto.ManagerDTO;
import com.xworkz.carshowroom.showroom.CarShowroom;

public class ShowRoomTester {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		CarShowroom car = new CarShowroom();
		car.addManager("ram", 9875647364l);

		car.displayManager();

		car.addManager("john", 983765743l);
		car.displayManager();

		ManagerDTO dto = new ManagerDTO("patil", 9474746474l);
		car.addManager(dto);
		car.displayManager();
		car.updateManager("mohan");
		System.out.println("new manager:" + dto.getName());
		car.updateManager(9283645263l);
		System.out.println("new contactno.:" + dto.getContactNo());

		car.addManager(null);

		car.removeManager();
	}

}
