package com.practice.oop;

public class TestShape {
	public static void main(String[] args) {
		Shape n1 = new Shape();
		 
		n1.setColor("Bluck");
		n1.setBorderwidth(45); 
		
		System.out.println("n1 Shape:" + n1.getColor());
		System.out.println("n1 Shape:" + n1.getBorderwidth());
	}

}
