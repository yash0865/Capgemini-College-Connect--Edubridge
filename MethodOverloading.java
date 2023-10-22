package com.edubridge;

class Functions{
	void display() {
		System.out.println("No argument");
	}
	
	void display(int i) {
		System.out.println("One argument (int)");
	}
	
	void display(int i, int j) {
		System.out.println("Two argument (int)");
	}
	
	void display(float i) {
		System.out.println("One argument (float)");
	}
	
	void display(float i, int j) {
		System.out.println("Two argument (float & int)");
	}
	
	void display(short i) {
		System.out.println("Short int");
	}
	
	void display(byte i) {
		System.out.println("Byte int");
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functions f = new Functions();
		f.display();
		f.display(2.1f);
		f.display(12, 14);
		f.display(1.2f, 78);
		f.display((byte)12);
	}

}
