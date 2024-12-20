package com.studentmanagement.studentcrudapp.entities;

public class Student 
{
	private String stdId;
	private String stdName;
	private String standard;
	private int roll;
	private int age;
	private String address;
	/*----------------------Parameterised Constructor ------------------------------------*/
	public Student(String stdId, String stdName, String standard, int roll, int age, String address) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.standard = standard;
		this.roll = roll;
		this.age = age;
		this.address = address;
	}
	/*------------------------Default Constructor ------------------------------------------*/
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*------ Getter and setter methods -----------------*/
	public String getStdId() {
		return stdId;
	}
	public void setStdId(String stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	/*----- overriding toString() method -------*/
	@Override
	public String toString() {
		return "\n Student Id :" + stdId + 
				"\n Student Name : " + stdName + 
				"\n Standard=" + standard + 
				"\n Roll Number : " + roll+
				"\n Age : " + age + 
				"\n Address : " + address +
				"\n-------------------------------------------------";
	}
	
}


