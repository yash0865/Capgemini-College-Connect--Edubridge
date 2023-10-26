package com.edu.pack1;

abstract class Product{
	private int pid;
	private String pname;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	
	void display() {
		System.out.println("Product id ="+pid);
		System.out.println("Product name="+pname);
	}
	
	
}
class Product1 extends Product{
	Product1(int pid, String pname){
		super(pid, pname);
	}
	
	
}

public class MainAppConstAbstr {
	public static void main(String[] args) {
	Product1 pob= new Product1(12,"TV");
	pob.display();
	}
}