package com.xworkz.vtu;

import com.xworkz.vtu.engineer.CIVILEngineer;
import com.xworkz.vtu.engineer.CSEngineer;
import com.xworkz.vtu.engineer.ECEnginner;
import com.xworkz.vtu.engineer.EEEngineer;
import com.xworkz.vtu.engineer.Engineer;
import com.xworkz.vtu.engineer.ISEngineer;
import com.xworkz.vtu.engineer.MECHEngineer;
import com.xworkz.vtu.engineer.TCEngineer;

public class VTUTester {

	public static void main(String[] args) {
		

		Engineer engineer=new Engineer();
	
		System.out.println(engineer.USN);
		System.out.println(engineer.branch);
		engineer.problemSolving();
		
		CSEngineer cs=new CSEngineer();
		System.out.println(cs.USN);
		System.out.println(cs.getBranch());
		System.out.println(cs.getParentBranch());
		cs.problemSolving();
		
		Engineer engineer1=new CSEngineer();
		System.out.println(engineer1.branch);
		
		CSEngineer cs2=(CSEngineer)engineer1;
		System.out.println(cs2.branch);
		engineer1.problemSolving();
		
		TCEngineer tcE=new TCEngineer();
		System.out.println(tcE.branch);
		tcE.problemSolving();
		System.out.println(tcE.branchE);
		
		ISEngineer is=new ISEngineer();
		System.out.println(is.branch);
		is.problemSolvinig();
		
		ECEnginner ec=new ECEnginner();
		System.out.println(ec.branch);
		ec.problemSolvinig();
		
		MECHEngineer mech=new MECHEngineer();
		System.out.println(mech.getBranch());
		mech.problemSolvinig();
		
		Engineer eng=new CIVILEngineer();
		CIVILEngineer civil=(CIVILEngineer)eng;
		System.out.println(civil.branch);
		civil.problemSolving();
		
		
		EEEngineer eee=new EEEngineer();
		System.out.println(eee.branch);
		eee.electricAndElectronic();
		
		
		
		
	}

}
