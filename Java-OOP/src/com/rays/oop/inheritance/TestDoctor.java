package com.rays.oop.inheritance;

public class TestDoctor {
	public static void main(String[] args) {
		Doctor a1 = new Doctor();
		
		a1.setName("Rohit Devda");
		a1.setAddress("Khudel Dist:-Indore");
		a1.setRegistrationNo("105554523");
		
		System.out.println("a1 Doctor Name:-" +a1.getName());
		System.out.println("a1 Doctor Address:-" +a1.getAddress());
		System.out.println("a1 Doctor Registration No:-" +a1.getRegistrationNo());
	}

}
