package com.xworkz.data;

import com.xworkz.data.dto.CustomerDTO;

public class DTOTester {

	public static void main(String[] args) {
		
		CustomerDTO customerDTO=new CustomerDTO();
		customerDTO.setName("surakshita");
		customerDTO.setContactNo(9448126235l);
		customerDTO.setCustomerID(01);
		customerDTO.setEmail("surakshita.xworkz@gmial.com");
		System.out.println(customerDTO.getName());
		System.out.println(customerDTO.getContactNo());
		System.out.println(customerDTO.getCustomerID());
		System.out.println(customerDTO.getEmail());
		
		
		CustomerDTO customerDTO2=new CustomerDTO();
		customerDTO2.setName("xworkz");
		customerDTO2.setContactNo(8234516372l);;
		customerDTO2.setCustomerID(02);
		customerDTO2.setEmail("xworkz@gmail.com");
		System.out.println(customerDTO2.getName());
		System.out.println(customerDTO2.getContactNo());
		System.out.println(customerDTO2.getCustomerID());
		System.out.println(customerDTO2.getEmail());
		
		
		CustomerDTO customerDTO3=new CustomerDTO();
		customerDTO3.setName("emily");
		customerDTO3.setContactNo(7465391736l);
		customerDTO3.setCustomerID(03);
		customerDTO3.setEmail("emily321@gmail.com");
		System.out.println(customerDTO3.getName());
		System.out.println(customerDTO3.getContactNo());
		System.out.println(customerDTO3.getCustomerID());
		System.out.println(customerDTO3.getEmail());
		
		
		
	}

}
