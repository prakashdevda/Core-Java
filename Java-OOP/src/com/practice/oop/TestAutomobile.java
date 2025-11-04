package com.practice.oop;

public class TestAutomobile {
	public static void main(String[] args) {
		Automobile m1 = new Automobile();

		m1.setMake("Hero Model");
		m1.setColor("Black Color");
		m1.setSpeed(100);

		System.out.println("m1 Car modal:- " + m1.getMake());
		System.out.println("m1 Car Color:- " + m1.getColor());
		System.out.println("m1 Car Speed:- " + m1.getSpeed());
		m1.accilater();
		m1.brreak();

	}

}
