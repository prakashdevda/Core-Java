package com.rays.oop.inheritance;

public class TestRectangle  {
	public static void main(String[] args) {

	    Rectangle n1 = new Rectangle();
	     n1.setLength(10);
	     n1.setWidth(15);
	     n1.setColor("Blue");
	     n1.setBorderwidth(12);
	     
	     System.out.println("n1 Rectangle Length:-"+n1.getLength());
	     System.out.println("n1 Rectangle Width:-"+n1.getWidth());
	     System.out.println("n1 Rectangle Color:-"+n1.getColor());
	     System.out.println("n1 Rectangle Borderwidth:-"+n1.getBorderwidth());
	     
	}      

}
