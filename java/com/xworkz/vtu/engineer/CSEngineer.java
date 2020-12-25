package com.xworkz.vtu.engineer;

import com.xworkz.vtu.constants.Branch;

public class CSEngineer extends Engineer{
	
	public Branch branch=Branch.CS;
	
	public void problemSolving()
	{
		super.problemSolving();
		System.out.println("invoked problem solvining");
		System.out.println("problem solved"+this.branch);
	}
	public void coding()
	{
		System.out.println("invoked coding");
	}
	public Branch getBranch() {
		return branch;
	}
	public Branch getParentBranch()
	{
		return super.branch;
	}


}
