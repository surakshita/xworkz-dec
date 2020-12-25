package com.xworkz.device;

import com.xworkz.device.computer.Computer;
import com.xworkz.device.computer.Desktop;
import com.xworkz.device.computer.Laptop;

public class ComputerTester {

	public static void main(String[] args) {

		/*Computer comp = new Computer();

		Desktop des = (Desktop) comp;
		des.setCompanyName("Apple");
		System.out.println(des.getCompanyName());
		des.setOs("MAC");
		System.out.println(des.getOs());
		des.turnOn();

		Computer computer1 = new Laptop();
		Laptop lap = (Laptop) computer1;
		lap.touchScreen();
		System.out.println(lap.getCompanyName());
		lap.setDisplay("15.60-inch resolution");
		lap.setVersion(11);
		System.out.println(lap.getDisplay());
		System.out.println(lap.getVersion());
		*/

		Desktop desktop = new Desktop();
		desktop.setOs("windows");
		System.out.println(desktop.getOs());
		desktop.batteryPercent();

		Laptop laptop = new Laptop();
		laptop.setCompanyName("SONY");
		laptop.setRam(8);
		System.out.println(laptop.getCompanyName());
		System.out.println(laptop.getRam());
		
		
		Computer computer=new Laptop();
		computer=new Desktop();
		if(computer instanceof Laptop)
		{
			System.out.println("converted instace ");
			Laptop laptopCasted=(Laptop)computer;
		}
		else
		{
			System.out.println("no instance");
		}

	}

}
