package com.practice.oop;

public class Automobile {
	private String make;
	private String color;
	private int speed;
	
	public String getMake() {
		return this.make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void accilater() {
		speed = speed + 20;
		System.out.println("New Speed:- "+ speed);
	}
	public void brreak() {
		speed = speed - 10;
		System.out.println("New Break Speed:- "+ speed);
	}

}
