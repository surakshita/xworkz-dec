package com.xworkz.bakery.browser;

public class Browser {

	private String name;

	public String getName() {
		System.out.println("string type method");
		return name;
	}

	public void setName(String name) {
		System.out.println("void type method");
		this.name = name;
	}

}
