package com.xworkz.vtu.engineer;

import com.xworkz.vtu.constants.Branch;

public class ECEnginner extends Engineer{
	
	public Branch branch=Branch.EC;
	
	public void electric()
	{
		System.out.println("invoked electric");
	}
	public void problemSolvinig()
	{
		super.problemSolving();
		System.out.println("invoked problem solvining");
		System.out.println("problem solved");
	}
	public Branch getBranch() {
		return branch;
	}
	


}
