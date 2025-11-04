package com.practice.oop;

import java.util.Date;

public class Person {
	private String name;
	private String address;
	private Date date;
	private int age;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDate() {
		return this.date;
	}
	public void setDate(Date date) {
		this.date = date;	
	}
	public int getAge() {
	return this.age; 
	}
	public void setAge(int age) {
		this.age = age;
	}
}
