package com.rays.oop;

public class TestAutomobile {

	public static void main(String[] args) {

		Automobile a = new Automobile();

		a.setMake("Mahindra");
		a.setColor("Black");
		a.setSpeed(20);

		System.out.println("car name: " + a.getMake());
		System.out.println("car color: " + a.getColor());
		System.out.println("current speed: " + a.getSpeed());
		a.acceletor();
		a.acceletor();
		a.braek();

	}

}
