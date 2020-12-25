package com.xworkz.vtu.engineer;



import com.xworkz.vtu.constants.Branch;

public class MECHEngineer extends Engineer{
	
	public final Branch branch=Branch.MECH;
	
	public void problemSolvinig()
	{
		System.out.println("invoked problem solvining");
		System.out.println("problem solved");
	}
	
	public void mechanical()
	{
		System.out.println("mechanical invoked");
	}

	public Branch getBranch() {
		return branch;
	}


}
