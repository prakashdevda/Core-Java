package com.practice.inheritance;

public class TestStudentMBBS {
	public static void main(String[] args) {
		StudentMBBS a1 = new StudentMBBS();
		a1.setName("Sumit Yadabv");
		a1.setAddress("Indore");
		a1.setRollno("125433");
		a1.setCollege("Index Medical College");
		a1.setSubject("Pharmacy");
		a1.setSubjectcode(220055);
		a1.setStudentId("Sumit1112223");
		a1.setPassward(123454);
		
		
	
		System.out.println("a1 Studend  Name:        " +a1.getName());
		System.out.println("a1 Student  Address      " +a1.getAddress());
		System.out.println("a1 Student  Roll no      " +a1.getRollno());
		System.out.println("a1 student  College      " +a1.getCollege());
		System.out.println("a1 Student  Subject      " +a1.getSubject());
		System.out.println("a1 Student  SubjectCode  " +a1.getSubjectcode());
		System.out.println("a1 Student  ID           " +a1.getStudentId());
		System.out.println("a1 student  Passward     " +a1.getPassward());
		
	}
}
