package com.xworkz.data;

import java.util.Arrays;

import com.xworkz.data.dto.CountryDTO;

public class CountryDTOTester {

	public static void main(String[] args) {
		
		CountryDTO country=new CountryDTO();
		System.out.println(country.getName());
		
		CountryDTO dto=new CountryDTO("india","asia");
		System.out.println(dto.getName());
		System.out.println(dto.getContinent());
		
		System.out.println("setting values using setter method");
		dto.setPopulation(138004385);
		dto.setLanuages(new String[] {"Telugu", "Urdu", "Hindi", "Tamil" ,
				"Marathi","Nishi", "Adi", "Bengali", "Nepali ","kannada",
				"assamese","konkani","marathi","gujurati","sinhi","haryani"});
		
		System.out.println(dto.getPopulation());
		System.out.println(Arrays.toString(dto.getLanuages()));
		
		String[] states=new String[2];
		states[0]="delhi";
		states[1]="goa";
		
		CountryDTO dto1=new CountryDTO(states,138004385);
		System.out.println(Arrays.toString(dto1.getStates()));
		System.out.println(dto1.getPopulation());
		
		String[] lang=new String[3];
		lang[0]="hindi";
		lang[1]="english";
		lang[2]="gujurati";
		
		CountryDTO dto2=new CountryDTO("Narendra modi",lang);
		System.out.println(dto2.getPrimeMinister());
		System.out.println(Arrays.toString(dto2.getLanuages()));
		 CountryDTO dto3=new CountryDTO("ram nath koving");
		 System.out.println(dto3.getPresident());
		
		
		
		
		
		
		

	}
}

