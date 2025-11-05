package com.practice.inheritance;

public class TestStudentBTech {
	public static void main(String[] args) {
		
		StudentBTech a1 = new StudentBTech();
		
		a1.setName("Ram Rathor");
		a1.setAddress("Dewas");
		a1.setRollno("12554565");
		a1.setCollege("Chamelidevi");
		a1.setSubject("Mathmatichs");
		a1.setSubjectcode(12344);
		a1.setStudentId("144262256");
		
		
		System.out.println("a1 Student Name         " +a1.getName());
		System.out.println("a1 Student address      " + a1.getAddress());
		System.out.println("a1 Student Roll no      " + a1.getRollno());
		System.out.println("a1 Student College      " + a1.getCollege());
		System.out.println("a1 Student Subject      " +a1.getSubject());
		System.out.println("a1 Student Subjectcode  " +a1.getSubjectcode());
		System.out.println("a1 Student Id           " + a1.getStudentId());
	
		

	}

}
