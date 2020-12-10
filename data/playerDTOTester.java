package com.xworkz.data;


import java.util.Arrays;

import com.xworkz.data.dto.PlayerDTO;

public class PlayerDTOTester {

	public static void main(String[] args) {
		
		PlayerDTO playerDTO=new PlayerDTO();
		String[] sports=new String[2];
		sports[0]=new String("baseball");
		sports[1]=new String("football");
		playerDTO.setSports(sports);
		System.out.println("array of sports:"+Arrays.toString(sports));
		
		String[] awards=new String[2];
		awards[0]=new String("HEISMAN TROPHY");
		awards[1]=new String("PRO BOWLER");
		playerDTO.setAwards(awards);
		System.out.println("awards:"+Arrays.toString(awards));
		
		playerDTO.setName("BO JACKSON");
		playerDTO.setCountry("AMERICA");
		System.out.println(playerDTO.getName());
		System.out.println(playerDTO.getCountry());
		
		System.out.println("* * * * * * * * * * * * * * *");
		
		PlayerDTO playerDTO1=new PlayerDTO();
		String[] sports1=new String[3];
		sports1[0]=new String("football");
		sports1[1]=new String("basketball");
		sports1[2]=new String("track");
		playerDTO1.setSports(sports1);
		System.out.println("array of sports:"+Arrays.toString(sports1));
		
		String[] awards1=new String[2];
		awards1[0]=new String("5th in NATIONAL CHAMPIONSHIP FOR DECATHLON");
		awards1[1]=new String("second leading scorer in basketball");
		playerDTO1.setAwards(awards1);
		System.out.println("awards:"+Arrays.toString(awards1));
		
		playerDTO1.setName("JIM BROWN");
		playerDTO1.setCountry("AMERICA");
		System.out.println(playerDTO1.getName());
		System.out.println(playerDTO1.getCountry());
		
		System.out.println("* * * * * * * * * * * * * * *");
		
		PlayerDTO playerDTO2=new PlayerDTO();
		String[] sports2=new String[3];
		sports2[0]=new String("football");
		sports2[1]=new String("basketball");
		sports2[2]=new String("track");
		playerDTO2.setSports(sports2);
		System.out.println("array of sports:"+Arrays.toString(sports2));
		
		String[] awards2=new String[1];
		awards2[0]=new String("NATIONAL LEAGUE MVP ");
		
		playerDTO2.setAwards(awards2);
		System.out.println("awards:"+Arrays.toString(awards2));
		
		playerDTO2.setName("JACKIE ROBINSON");
		playerDTO2.setCountry("AFRICAN-AMERICA");
		System.out.println(playerDTO2.getName());
		System.out.println(playerDTO2.getCountry());
		
		System.out.println("* * * * * * * * * * * * * * *");
		

		
		
		
		
		
		
		
		
	
		
		
	}

}
