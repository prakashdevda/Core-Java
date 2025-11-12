package com.rays.oop.polymorphism;

public class TestShapeByArrays {
	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		
		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle();
		
		Circle c = (Circle) s[0];
		c.setRadius(4);
		
		Rectangle r = (Rectangle) s[1];
		r.setLength(6);
		r.setWidth(8);
		
		Triangle t = (Triangle) s[2];
		t.setBase(15);
		t.setHight(5);
		
		for(int i=0; i < s.length; i++) { 
			
			System.out.println("Shapes Area: "+ s[i].area());
		}
	}
	
		
	

}
