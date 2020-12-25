package com.xworkz.vtu.engineer;

import com.xworkz.vtu.constants.Branch;

public class TCEngineer extends Engineer{
	
	public Branch branch=Branch.TC;
	public final Branch branchE=Branch.EEE;
	
	public void problemSolvinig()
	{
		System.out.println("invoked problem solvining");
		System.out.println("problem solved"+this.branch);
	}

	
	

}
