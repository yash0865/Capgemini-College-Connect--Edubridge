package com.edubridge;

//Programs Homework:
//1.Area Rectangle 
//2.Square
//3.Circle
//4.Triangle

public class Area {

	public static void main(String[] args) {

		double length = 12, width = 14;
		System.out.println("Area of rectangle : " + rectangle(length, width));
		
		double side = 10;
		System.out.println("Area of square : " + square(side));
		
		double radius = 14;
		System.out.println("Area of circle : " + circle(radius));

		double base = 14, heigth = 10;
		System.out.println("Area of triangle : " + triangle(base, heigth));
	}
	
	public static double rectangle(double length, double width) {
		return length * width;
	}
	
	
	public static double square(double side) {
		return side * side;
	}
	
	public static double circle(double radius) {
		return Math.PI * radius * radius;
	}
	
	public static double triangle(double base, double height) {
		return base * height / 2;
	}

}
