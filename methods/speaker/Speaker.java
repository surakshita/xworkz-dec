package com.xworkz.methods.speaker;

public class Speaker {
	
	private String brand="JBL";
	private String color;
	private int batteryBackup;
	
	//properties of speaker
	private boolean connectivity;
	private int maxVolumeLevel=4;
	private int minVolumeLevel=0;
	private int currentVolume=0;
	
	
	public Speaker(String color,int batteryBackup)
	{
		this.color=color;
		this.batteryBackup=batteryBackup;
		System.out.println("color:"+color);
		System.out.println("battery backup is hrs:"+batteryBackup);
	}
	//methods
	
	public void onOrOff() {
		System.out.println("speaker button pressed");
		
		if(this.connectivity==false)
		{
			this.connectivity=true;
			System.out.println("speaker is : ON");
		}
		else if(this.connectivity ==true)
		{
			this.connectivity=false;
			System.out.println("speaker is : OFF");
		}
	}
	
	public void volumeTurned()
	{
		if(this.connectivity==true) {
			
		
		if(this.currentVolume<this.maxVolumeLevel)
		{
			this.currentVolume=this.currentVolume+1;
			System.out.println("speaker volume:"+currentVolume);
		}
		else if(this.currentVolume==this.maxVolumeLevel)
		{
			System.out.println("beep beep");
			System.out.println("current volume is:"+this.currentVolume);
		}
		else {
			System.out.println("speaker is off");
		}
		}
	}
	
	public void volumeDecrease() 
		{
		if(this.connectivity==true) 
		{
			
			if(this.currentVolume>this.minVolumeLevel)
			{
				this.currentVolume=this.currentVolume-1;
				System.out.println("speaker volume:"+this.currentVolume);
			}
			else if(this.currentVolume==this.minVolumeLevel)
			{
				System.out.println("beep beep");
				
			}
		else
		{
				System.out.println("speaker is off");
		}
		}
	}
	
	

	public boolean isConnectivity() {
		return connectivity;
	}

	public int getMaxVolumeLevel() {
		return maxVolumeLevel;
	}

	public int getMinVolumeLevel() {
		return minVolumeLevel;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public int getBatteryBackup() {
		return batteryBackup;
	}

}


