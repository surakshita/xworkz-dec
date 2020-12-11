package com.xworkz.data;

import com.xworkz.data.dto.CompanyDTO;

public class CompanyTester {

	public static void main(String[] args) {

		CompanyDTO dto = new CompanyDTO();
		dto.setName("TCS");
		dto.setCompanyType("SOFTWARE");
		dto.setCountry("india");
		dto.setEmployeeID(1234);
		dto.setEmployeeName("ram");
		dto.setStock(2784);

		System.out.println(dto.getCompanyType());
		System.out.println(dto.getCountry());
		System.out.println(dto.getEmployeeID());
		System.out.println(dto.getEmployeeName());
		System.out.println(dto.getName());
		System.out.println(dto.getStock());

		CompanyDTO dto1 = new CompanyDTO();

		dto1.setName("infoysy");
		dto1.setCompanyType("software");
		dto1.setCountry("indian");
		dto1.setEmployeeID(2345);
		dto1.setEmployeeName("murthy");
		dto1.setStock(1168);

		System.out.println(dto1.getCompanyType());
		System.out.println(dto1.getCountry());
		System.out.println(dto1.getEmployeeID());
		System.out.println(dto1.getEmployeeName());
		System.out.println(dto1.getName());
		System.out.println(dto1.getStock());
	}

}
