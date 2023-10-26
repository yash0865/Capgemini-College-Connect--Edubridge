package com.edu.pack1;


abstract class Ex1 {
	abstract void method1() ;
	abstract void method2() ;
	
	//can't overide
	final void finalDisplay() {
		System.out.println("Final method");
	}
	
	//can't overide
	static void staticDisplay() {
		System.out.println("Static method");
	}
}

abstract class Ex2 extends Ex1{
	void method1(){
		System.out.println("Method 1");
	}
	
	static void staticDisplay() {
		
	}
}

class Ex3 extends Ex2{
	void method2() {
		System.out.println("Method 2");
	}
}

public class MainApp {
	public static void main(String[] args) {
		Ex3 ob = new Ex3();
		ob.method1();
		ob.method2();
		ob.finalDisplay();
		ob.staticDisplay();
	}
}
