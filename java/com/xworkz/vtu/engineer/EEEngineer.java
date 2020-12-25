package com.xworkz.vtu.engineer;

import com.xworkz.vtu.constants.Branch;

public class EEEngineer extends Engineer{
	
	public final Branch branch=Branch.EEE;
	
	public void electricAndElectronic()
	{
		System.out.println("invoked electricAndElectronic");
		System.out.println(this.branch);
	}

	public Branch getBranch() {
		return branch;
	}
	

}
