package com.rays.oop;

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

	public void acceletor() {

		speed = speed + 20;
		System.out.println("new speed: " + speed);

	}
	
	public void braek() {

		speed = speed - 10;
		System.out.println("Break: new speed: " + speed);

	
		
	}
}
