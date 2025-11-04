package com.rays.oop.inheritance;

public class TestBusinessman {
	public static void main(String[] args) {
		Businessman n1 = new Businessman();
		
		n1.setName("Shubham Sharma");
		n1.setAddress("Vijaynagar Dist:-Indore");
		n1.setIncome(45000);
		
		System.out.println("n1 Businessman Name:-" +n1.getName());
		System.out.println("n1 Businessman Address:-" +n1.getAddress());
		System.out.println("n1 Businessman Income:-" +n1.getIncome());
		
	}

}
