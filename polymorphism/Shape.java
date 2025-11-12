package com.rays.oop.polymorphism;

public class Shape {
	protected String color;
	protected int borderwidth;

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBorderwidth() {
		return this.borderwidth;
	}

	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}

	public double area() {
		return 0.0;
	}

	public static Shape getShape(int i) {
		if (i == 1) {
			return new Circle();
		}
		if (i == 2) {
			return new Triangle();
		}
		if (i == 3) {
			return new Rectangle();
		}

		return new Shape();
	}

}
