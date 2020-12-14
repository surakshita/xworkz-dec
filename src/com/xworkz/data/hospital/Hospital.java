package com.xworkz.data.hospital;

import com.xworkz.data.dto.AppointmentDTO;

public class Hospital {
	
	private String name;
	private String location;
	private int noOfAppointments=5;
	private AppointmentDTO appointmentDTO;
	
	public Hospital(String name,String location)
	{
		this.name=name;
		this.location=location;
	}
	public void appointment(String name,long phoneNo,int age,String reason,String doctor) {
		this.appointmentDTO=new AppointmentDTO(name,phoneNo,age,reason,doctor);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getNoOfAppointments() {
		return noOfAppointments;
	}
	public void setNoOfAppointments(int noOfAppointments) {
		this.noOfAppointments = noOfAppointments;
	}
	public AppointmentDTO getAppointmentDTO() {
		return appointmentDTO;
	}
	public void setAppointmentDTO(AppointmentDTO appointmentDTO) {
		this.appointmentDTO = appointmentDTO;
	}
	

}
