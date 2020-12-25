package com.xworkz.vtu.engineer;

import com.xworkz.vtu.constants.Branch;

public class CIVILEngineer extends Engineer {
	
	public Branch branch=Branch.CIVIL;
	
	public void construct()
	{
		System.out.println("construct invoked");
	}

}
