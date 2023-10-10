package com.edubridge;

import java.util.Scanner;

class CalculateArea{
	double area;
	static Scanner sc = new Scanner(System.in);
	
	void square() {
		System.out.print("Enter side of square : ");
		double side = sc.nextDouble();
		area = side * side;
	}
	
	void circle() {
		System.out.print("Enter radius : ");
		double radius = sc.nextDouble();
		area = Math.PI * radius * radius;
	}
	
	void rectangle() {
		System.out.print("Enter length : ");
		double length = sc.nextDouble();
		System.out.print("Enter breadth : ");
		double breadth = sc.nextDouble();
		area = length * breadth;
	}
	
	void triangle() {
		System.out.print("Enter base : ");
		double base = sc.nextDouble();
		System.out.println("Enter height : ");
		double height = sc.nextDouble();
		area = base * height / 2;
	}
	
	void display() {
		System.out.println("Area = "+area);
	}
}

public class SwitchCaseExample2 {
	public static void main(String[] args) {
		System.out.println("--------------- My Menu ---------------");
		System.out.println("1.Area of Square");
		System.out.println("2.Area of Rectangle");
		System.out.println("3.Area of Circle");
		System.out.println("4.Area of Triangle");
		
		System.out.print("Enter your choice : ");
		int choice = CalculateArea.sc.nextInt();
		
		CalculateArea area = new CalculateArea();
		
		switch(choice) {
		case 1:
			area.square();
			area.display();
			break;
		case 2:
			area.rectangle();
			area.display();
			break;
		case 3:
			area.circle();
			area.display();
			break;
		case 4:
			area.triangle();
			area.display();
			break;
		default:
			System.out.println("Invalid Input!");
		}
	}
}
