package com.rays.oop.inheritance;

public class TestStudent {
	public static void main(String[] args) {
		Student a1 = new Student();
		
		a1.setName("Vishal Yadav");
		a1.setAddress("Vijaynagar Dist:-Indore");
		a1.setRollnumber("1200560060023");
		a1.setMarks(55);
		
		System.out.println("a1 Student Name:-" + a1.getName());
		System.out.println("a1 Student Address:-" +a1.getAddress());
		System.out.println("a1 Student Rollnumber:-" +a1.getRollnumber());
		System.out.println("a1 Student Marks:-" +a1.getMarks());
		
		System.out.println("---------------------------------------------------");
	}

}
