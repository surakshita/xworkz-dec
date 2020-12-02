package com.xworkz.copies.constructor;

public class Vehicle {
	private  String company;
	private String mfgDate;
	private String chassisNo;
	public String color;
	public String ownerName;
	
	public Vehicle(String company,String mfgDate,String chassisNo) {
		this.company=company;
		this.mfgDate=mfgDate;
		this.chassisNo=chassisNo;
		
	}

	public String getCompany() {
		return company;
	}

	public String getMfgDate() {
		return mfgDate;
	}

	public String getChassisNo() {
		return chassisNo;
	}

	
	public void setColor(String color) {
		this.color = color;
		System.out.println("color:"+color);
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
		System.out.println("owner name:"+ownerName);
	}
	


}
