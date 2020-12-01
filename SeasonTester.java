package com.xworkz.copies;

import com.xworkz.copies.constructor.Season;

public class SeasonTester {

	public static void main(String[] args) {
		
		
		Season season=new Season();
		System.out.println(season.name);
		System.out.println(season.startMonth);
		
		Season season1=new Season("summar","March");
		System.out.println(season1.name);
		System.out.println(season1.startMonth);
		
		
	}

}
