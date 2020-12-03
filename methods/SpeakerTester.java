package com.xworkz.methods;

import com.xworkz.methods.speaker.Speaker;

public class SpeakerTester {

	public static void main(String[] args) {
		
		Speaker speaker=new Speaker("black",5);
		System.out.println("Brand name :"+speaker.getBrand());
		
		speaker.onOrOff();
		//speaker.onOrOff();
		
		speaker.volumeTurned();
		speaker.volumeTurned();
		speaker.volumeTurned();
		speaker.volumeTurned();
		speaker.volumeTurned();
		
		speaker.volumeDecrease();
		speaker.volumeDecrease();
		speaker.volumeDecrease();
		speaker.volumeDecrease();
		speaker.volumeDecrease();
	}

}
