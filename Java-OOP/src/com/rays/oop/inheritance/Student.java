package com.rays.oop.inheritance;

public class Student extends Person {
	private String rollnumber;
	private int marks;
	
	public String getRollnumber() {
		return this.rollnumber;
	}
	public void setRollnumber(String rollnumber) {
		this.rollnumber = rollnumber;
	}
	public int getMarks() {
		return this.marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

}
