package com.rays.oop.inheritance;

public class TestCircle {
	public static void main(String[] args) {
		Circle n1 = new Circle();
		
		n1.setRadius(10);
		n1.setColor("Yellow");
		n1.setBorderwidth(12);
		
		System.out.println("n1 Circle: "+ n1.getRadius());
		System.out.println("n1 Circle: "+ n1.getColor());
		System.out.println("n1 Circle: "+ n1.getBorderwidth());
	}

}
