package com.edubridge;


class AreaOfFig{
	void area(int s) {
		System.out.println("Area of square = "+ s*s);
	}
	
	void area(int l, int b) {
		System.out.println("Area of rectangle = " + l*b);
	}
	
	float area(int base, float ht) {
		return (base * ht) / 2;
	}
	
	void area(double radius) {
		System.out.println("Area of circle = "+(Math.PI + radius * radius));
	}
}

public class MethodOverLoadDemo {

	public static void main(String[] args) {
		AreaOfFig fig = new AreaOfFig();
		fig.area(12);
		fig.area(12, 10);
		System.out.println("Area of triangle = "+fig.area(10, 5f));
		fig.area(15d);
	}

}
