package com.xworkz.carshowroom.showroom;

import com.xworkz.carshowroom.constants.CarVariant;
import com.xworkz.carshowroom.dto.CarDTO;

import com.xworkz.carshowroom.dto.ManagerDTO;

/**
 * 
 * @author surakshita
 *
 */

public class CarShowroom {

	private String name;
	private String location;
	private ManagerDTO managerDTO;
	private CarDTO[] cars = new CarDTO[4];
	private int curruntIndex = 0;

	public CarShowroom() {
		System.out.println("carshowroom created");
	}

	/**
	 * 
	 * @param name
	 * @param location
	 */
	public CarShowroom(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	/**
	 * 
	 * @param name
	 * @param contactNo
	 */
	public void addManager(String name, long contactNo) {
		if (name != null || contactNo > 0) {
			this.managerDTO = new ManagerDTO(name, contactNo);
			System.out.println("valid data");
		} else {
			System.out.println("detail invalid");
			this.managerDTO = null;
		}
	}

	/**
	 * 
	 * @param dto
	 */
	public void addManager(ManagerDTO dto) {
		if (dto != null) {
			this.managerDTO = dto;
			System.out.println("added manager");
		} else {
			System.out.println("manager not added");
		}
	}

	public void displayManager() {
		if (this.managerDTO != null) {
			System.out.println(this.managerDTO.getName());
			System.out.println(this.managerDTO.getContactNo());
		} else {
			System.out.println("manager not found");
		}
	}

	public void removeManager() {
		this.managerDTO = null;
		System.out.println("manager removed");
	}

	/**
	 * 
	 * @param name
	 */

	public void updateManager(String name) {
		if (name != null && this.managerDTO != null) {
			this.managerDTO.setName(name);
			System.out.println("updated name");
		} else {
			System.out.println("cannot update name");
		}
	}

	/**
	 * 
	 * @param newContactNo
	 */

	public void updateManager(long newContactNo) {
		if (this.managerDTO != null && newContactNo > 0) {
			this.managerDTO.setContactNo(newContactNo);
			System.out.println("updated number");

		} else {
			System.out.println("number cant be updated");
		}
	}

	/**
	 * 
	 * @param dto
	 */

	public void addCars(CarDTO dto) {
		if (dto != null && this.curruntIndex < 5) {

			System.out.println("add cars");
			System.out.println("current index:" + this.curruntIndex);
			this.cars[curruntIndex] = dto;

			this.curruntIndex++;

		} else {
			if (dto == null) {
				System.out.println("cannot add empty and null");
			}
			if (dto != null) {
				System.out.println("cars can be added:" + this.curruntIndex);
			}

			System.out.println("current index:" + this.curruntIndex);
		}
	}

	public void displayCars() {
		for (int i = 0; i < this.cars.length; i++) {
			CarDTO dto = this.cars[i];
			System.out.println("display car:" + dto);
			System.out.println(dto.getModel());
			System.out.println(dto.getPrice());
			System.out.println(dto.getVariant());
		}
	}

	/**
	 * 
	 * @param newVariant
	 * @param indexToUpdate
	 */

	public void updateCarVariant(CarVariant newVariant, int indexToUpdate) {
		if (newVariant != null && indexToUpdate >= 0 && indexToUpdate < 5) {
			System.out.println("car at index:" + indexToUpdate);
			System.out.println("updated variant:" + newVariant);

			CarDTO carDTO = this.cars[indexToUpdate];
			System.out.println("updated car:" + carDTO.getModel());
			carDTO.setVariant(newVariant);

		}
	}

	/**
	 * 
	 * @param indexToDisplay
	 */

	public void displayCarAtIndex(int indexToDisplay) {
		if (indexToDisplay >= 0 && indexToDisplay < 5) {
			System.out.println("can display at ondex:" + indexToDisplay);
			CarDTO refCar = cars[indexToDisplay];
			System.out.println(refCar.getModel());
			System.out.println(refCar.getPrice());
			System.out.println(refCar.getVariant());

		}
	}

	/**
	 * 
	 * @param model
	 */

	public void displayCarByModel(String model) {
		if (model != null)
			System.out.println("searching......:" + model);
		{
			for (int index = 0; index < this.cars.length; index++) {
				CarDTO refCarDTO = this.cars[index];
				String localModel = refCarDTO.getModel();
				if (localModel.equals(model)) {
					System.out.println("car model found");
					System.out.println(refCarDTO.getPrice());
					System.out.println(refCarDTO.getVariant());
					break;
				}
			}
		}
	}

	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public ManagerDTO getManagerDTO() {
		return managerDTO;
	}

	public void setManagerDTO(ManagerDTO managerDTO) {
		this.managerDTO = managerDTO;
	}

}
