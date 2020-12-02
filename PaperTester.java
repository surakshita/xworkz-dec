package com.xworkz.copies;

import com.xworkz.copies.constructor.Paper;

public class PaperTester {

	public static void main(String[] args) {
		
		Paper paper=new Paper(24.00f,18.00f,"brown");
		String brand=paper.getBrand();
		System.out.println(brand);
		float width=paper.getWidth();
		float height=paper.getHeight();
		String color=paper.getColor();
		
		
	
		System.out.println(color);
		
		paper.setHeight(12.00f);
		height=paper.getHeight();
		System.out.println("upated height:"+height);
		
		paper.setWidth(18.00f);
		width=paper.getWidth();
		System.out.println("updated width:"+width);
		
		
		
	}

}
