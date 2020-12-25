package com.xworkz.device.computer;

public class Computer {
	
	private String companyName;
	private int version;
	private int ram;
	
	public void turnOn()
	{
		System.out.println("computer is turned on");
	}
	public void batteryPercent()
	{
		System.out.println("percent of charge");
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	

}
