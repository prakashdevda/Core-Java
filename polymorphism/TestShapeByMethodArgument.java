package com.rays.oop.polymorphism;

public class TestShapeByMethodArgument {
	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		
		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle();
		
		Circle c = (Circle) s[0];
		c.setRadius(4);
		
		Rectangle r = (Rectangle) s[1];
		r.setLength(4);
		r.setWidth(5);
		
		Triangle t = (Triangle) s[2];
		t.setBase(6);
		t.setHight(4);
		
		double totalArea = ShapeByMethodArgument.getArea(s);
		System.out.println(totalArea);
	}

}
