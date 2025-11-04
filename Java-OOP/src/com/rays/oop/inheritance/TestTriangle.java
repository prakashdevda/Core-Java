package com.rays.oop.inheritance;

public class TestTriangle {
	public static void main(String[] args) {
		Triangle a1 = new Triangle();
		
		a1.setBase(8);
		a1.setHight(4);
		a1.setColor("Red");
		a1.setBorderwidth(2);
		
		System.out.println("a1 Triangle Base:-"+a1.getBase());
		System.out.println("a1.Triangle Hight:-"+a1.getHight());
		System.out.println("a1.Triangle Color:-"+a1.getColor());
		System.out.println("a1.Triangle Borderwidth:-"+a1.getBorderwidth());
	}

}
