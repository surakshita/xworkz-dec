package com.xworkz.bakery.browser;

public class Firefox extends Browser {

	private String version;

	public String getVersion() {
		System.out.println("version string type");
		return version;
	}

	public void setVersion(String version) {
		System.out.println("void type version");
		this.version = version;

	}

}
