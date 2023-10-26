package com.edu.pack1;

interface MyInterface1 {
	int k = 10;
	void method1();
}

class MyClass implements MyInterface1{
	@Override
	public void method1() {
		System.out.println("Interface method "+k);
	}
	
	public void method2() {
		System.out.println("MyClass method");
	}
}
public class MainAppInterface {
	public static void main(String[] args) {
		MyInterface1 obj = new MyClass();
		obj.method1();
		//obj.method2();
	}
}
