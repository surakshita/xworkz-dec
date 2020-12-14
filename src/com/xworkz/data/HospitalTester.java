package com.xworkz.data;

import com.xworkz.data.dto.AppointmentDTO;
import com.xworkz.data.hospital.Hospital;

public class HospitalTester {

	public static void main(String[] args) {
		

		Hospital hospital=new Hospital("sanjana","jewargi");
		System.out.println(hospital.getName());
		System.out.println(hospital.getLocation());
		
		
		hospital.appointment("ram", 7654386754l, 20, "backpain","Dr.jampa");
		
		AppointmentDTO appointment=hospital.getAppointmentDTO();
		
		System.out.println(appointment.getAge());
		System.out.println(appointment.getDoctorName());
		System.out.println(appointment.getName());
		System.out.println(appointment.getPhoneNo());
		System.out.println(appointment.getReason());
		
		
	}

}
