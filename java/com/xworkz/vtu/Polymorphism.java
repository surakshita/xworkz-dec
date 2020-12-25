package com.xworkz.vtu;

import com.xworkz.vtu.engineer.CSEngineer;
import com.xworkz.vtu.engineer.ECEnginner;
import com.xworkz.vtu.engineer.Engineer;
import com.xworkz.vtu.engineer.MECHEngineer;
import com.xworkz.vtu.engineer.TCEngineer;

public class Polymorphism {
	
	public static void main(String[] args)
	{
		Engineer engineer=new CSEngineer();
		Engineer engineer2=new TCEngineer();
		engineer.problemSolving();
		engineer2.problemSolving();
		
		Engineer eng=new ECEnginner();
		Engineer eng1=new MECHEngineer();
		eng.problemSolving();
		eng1.problemSolving();
	}

}
