package com.xworkz.data;

import java.util.Date;

import com.xworkz.data.dto.FileDTO;

public class FileDTOTester {

	public static void main(String[] args) {
		
		FileDTO dto=new FileDTO();
		dto.getName();
		dto.getSize();
		dto.getType();
		dto.getLocation();
		dto.getCreateDate();
		
		FileDTO dto1=new FileDTO("document",1000);
		System.out.println(dto1.getName());
		System.out.println(dto1.getSize());
		
		Date date=new Date();
		dto1.setCreateDate(date);
		
		FileDTO dto2=new FileDTO("c:",".doc",date);
		System.out.println(dto2.getLocation());
		System.out.println(dto2.getType());
		System.out.println(dto2.getCreateDate());
		
	}

}
