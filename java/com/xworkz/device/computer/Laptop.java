package com.xworkz.device.computer;

public class Laptop extends Computer{
	
	private String display;
	
	public void touchScreen()
	{
		System.out.println("laptop touch screen method invoked");
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}
	

}
