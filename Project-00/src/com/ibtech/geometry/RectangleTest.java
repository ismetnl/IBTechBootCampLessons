package com.ibtech.geometry;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(3,4);
		rectangle.setHeight(3);
		rectangle.setWidth(-4);
		System.out.println("Alan "+rectangle.getArea());
		System.out.println("Cevre "+rectangle.getPerimeter());
	}

}
