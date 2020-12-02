package com.xworkz.copies.constructor;

public class Paper {
	private String brand="Classmate";
	private float width;
	private float height;
	public String color;
	
	public Paper(float width,float height,String color)
	{
		
		this.width=width;
		this.height=height;
		this.color=color;
		
		
	}

	

	public String getBrand() {
		
		return brand;
	}



	public float getWidth() {
		System.out.println("width:"+width);
		return width;
	}

	public float getHeight() {
		System.out.println("height:"+height);
		return height;
	}

	public void setWidth(float width) {
		this.width = width;
	}



	public void setHeight(float height) {
		this.height = height;
	}



	public String getColor() {
		return color;
	}
	

}
