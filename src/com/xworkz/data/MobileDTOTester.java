package com.xworkz.data;

import com.xworkz.data.dto.MobileDTO;

public class MobileDTOTester {

	public static void main(String[] args) {
		
		MobileDTO dto=new MobileDTO("samsung",22999,"red","galaxy",16,"seoul","android","google");
		System.out.println(dto.getBrand());
		System.out.println(dto.getPrice());
		System.out.println(dto.getColor());
		System.out.println(dto.getCountry());
		System.out.println(dto.getDevice());
		System.out.println(dto.getModel());
		System.out.println(dto.getRam());
		System.out.println(dto.getVoiceAssistant());
		
		MobileDTO dto1=new MobileDTO("apple",69000,"black","iphone 11",8,"US","ios","siri");
		System.out.println(dto1.getBrand());
		System.out.println(dto1.getPrice());
		System.out.println(dto1.getColor());
		System.out.println(dto1.getCountry());
		System.out.println(dto1.getDevice());
		System.out.println(dto1.getModel());
		System.out.println(dto1.getRam());
		System.out.println(dto1.getVoiceAssistant());
		
		

	}

}
