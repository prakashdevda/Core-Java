package com.practice.oop;

public class TestStudent {
	public static void main(String[] args) {
		Student n1 = new Student();
		
		n1.setName("Sumit Yadav");
		n1.setAge();
		n1.setRollnumber(120012);
		n1.setCourse("B.Sc Computer Science");
		
		
		System.out.println("n1 Student Name:-" + n1.getName());
		System.out.println("n1 Student Age:-" + n1.getAge()+" Year");
		System.out.println("n1 Student Rollnumber:-" + n1.getRollnumber());
		System.out.println("n1 Student Course:-" + n1.getCourse());
		
	}

}
