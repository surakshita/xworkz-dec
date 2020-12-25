package com.xworkz.vtu.engineer;

import com.xworkz.vtu.constants.Branch;

public class ISEngineer extends Engineer{
	public Branch branch=Branch.IS;
	
	public void problemSolvinig()
	{
		
		System.out.println("invoked problem solvining");
		System.out.println("problem solved"+this.branch);
	}

	public Branch getBranch() {
		return branch;
	}
	

	

}
