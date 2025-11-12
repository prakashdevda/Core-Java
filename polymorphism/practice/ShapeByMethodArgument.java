package com.rays.oop.polymorphism.practice;

public class ShapeByMethodArgument {
	public static double getArea(Shape[] s) {
		double totalArea =0.0;
		
		for (int i=0; i<s.length; i++) {
			System.out.println("Shapes Area: "+ s[i].area());
			totalArea = totalArea + s[i].area();
		}
		return totalArea;
		
	}

}
