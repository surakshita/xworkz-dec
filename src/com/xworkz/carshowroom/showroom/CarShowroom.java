package com.xworkz.carshowroom.showroom;

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
		if (dto != null) {

			System.out.println("add cars");
			System.out.println("current index:" + this.curruntIndex);
			this.cars[curruntIndex] = dto;

			this.curruntIndex++;

		} else {
			System.out.println("cars cannot be added");
			System.out.println("current index:" + this.curruntIndex);
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
