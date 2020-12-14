package com.xworkz.data;
import com.xworkz.data.dto.ICUAdmissionDTO;
import com.xworkz.data.hospital.ICU;

public class ICUTester {

	public static void main(String[] args) {
		
		ICU icu;
		icu=new ICU(true,4000,false);
		icu.admissionDetails("ram","backpain","dr.rahul","para");
		ICUAdmissionDTO dto=icu.getAdmissionDTO();
		if(dto!=null)
		{
			System.out.println(dto.getPatientName());
			System.out.println(dto.getDoctorName());
			System.out.println(dto.getNurseAssigned());
			System.out.println(dto.getSeverity());
		}
		else
		{
			System.out.println("admission null");
		}
		icu.updateDoctor("Patil");
		System.out.println(dto.getDoctorName());
		icu.updateDoctorAndNurse("rohan","puja");
		System.out.println("updated Dr name:"+dto.getDoctorName());
		System.out.println("updated nurse name:"+dto.getNurseAssigned());
		

	}

}
