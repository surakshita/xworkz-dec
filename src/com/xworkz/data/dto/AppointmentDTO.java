package com.xworkz.data.dto;

public class AppointmentDTO {
	
	private String name;
	private long phoneNo;
	private int age;
	private String reason;
	private String doctorName;
	
	public AppointmentDTO()
	{
		System.out.println("constructor appoinmentdto is created");
	}
	
	public AppointmentDTO(String name, long phoneNo, int age, String reason, String doctorName) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.age = age;
		this.reason = reason;
		this.doctorName = doctorName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	

}
