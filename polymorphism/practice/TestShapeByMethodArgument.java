package com.rays.oop.polymorphism.practice;

public class TestShapeByMethodArgument {
	public static void main(String[] args) {
		 Shape[] s = new Shape[3];
	
	       s[0] = new Circle();
	       s[1] = new Rectangle();
	       s[2] = new Triangle();
	       
	       Circle c = (Circle) s[0];
	       c.setRadius(5);
	       
	       Rectangle r =(Rectangle) s[1];
	       r.setLength(10);
	       r.setWidth(8);
	       
	       Triangle t = (Triangle) s[2];
	       t.setBase(5);
	       t.setHight(10);
	       
	       double totalArea = ShapeByMethodArgument.getArea(s);
	       System.out.println("Total Shapes Area: " +totalArea);

	}
}
