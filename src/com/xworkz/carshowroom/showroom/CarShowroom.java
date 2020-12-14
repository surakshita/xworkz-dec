package com.xworkz.carshowroom.showroom;

import com.xworkz.carshowroom.dto.ManagerDTO;

public class CarShowroom {
	private String name;
	private String location;
	private ManagerDTO managerDTO;

	public CarShowroom() {
		System.out.println("carshowroom created");
	}

	public CarShowroom(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public void addManager(String name, long contactNo) {
		if (name != null || contactNo != 0) {
			this.managerDTO = new ManagerDTO(name, contactNo);
			System.out.println("valid data");
		} else {
			System.out.println("detail invalid");
			this.managerDTO = null;
		}
	}

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

	public void updateManager(String name) {
		this.managerDTO.setName(name);

	}
	public void updateManager(long newContactNo)
	{
		this.managerDTO.setContactNo(newContactNo);
	}

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
