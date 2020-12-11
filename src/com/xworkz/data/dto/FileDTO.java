package com.xworkz.data.dto;

import java.util.Date;

public class FileDTO {

	private String name;
	private double size;
	private String type;
	private String location;
	private Date createDate;

	public FileDTO() {
		System.out.println("created first constructor");
	}

	public FileDTO(String name, double size) {
		System.out.println("created constructor with two para");
		this.name = name;
		this.size = size;
	}

	public FileDTO(String type, String location, Date createDate) {
		System.out.println("created constructor with three para");
		this.type = type;
		this.location = location;
		this.createDate = createDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
