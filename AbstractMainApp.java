package com.edu.pack1;


abstract class AreaFigures{
	
	abstract void area();
	
	void display() {
		System.out.println("Display method of abstract class");
	}
}
class Reactangle extends AreaFigures{
	
	void area() {
		int l=8;
		int b=9;
		int a = l*b;
		System.out.println("Area of Reactangle="+a);
	}
	
}

class Square extends AreaFigures{
	
	void area() {
		int l=8;
		
		int a = l*l;
		System.out.println("Area of Square="+a);
	}
	
}
public class AbstractMainApp {

	public static void main(String[] args) {
	//	AreaFigures aob = new AreaFigures();  //we cannot create an object for abstract class
		Reactangle rob = new Reactangle();
		rob.area();
		
		Square sob = new Square();
		sob.area();
	
	}

}