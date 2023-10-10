package com.edubridge;

import java.util.Scanner;

class Product{
	int pid;
	String pname;
	float price;
	static String cname = "Wipro";
	
	   void inputProduct(){
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter product id : ");
		   pid = sc.nextInt();
		   System.out.println("Enter product name : ");
		   pname = sc.next();
		   System.out.println("Enter product price : ");
		   price = sc.nextFloat();
		   System.out.println();
	   }

	   void displayProduct(){  
		   System.out.println("Product Details : ");
		   System.out.println("Product ID : "+pid);
		   System.out.println("Product name : "+ pname);
		   System.out.println("Price : ₹"+price);
		   System.out.println();
	  }
	   
	   
}

public class MainProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		Product p5 = new Product();
		
		p1.inputProduct();
		p2.inputProduct();
		p3.inputProduct();
		p4.inputProduct();
		p5.inputProduct();
		
		p1.displayProduct();
		p2.displayProduct();
		p3.displayProduct();
		p4.displayProduct();
		p5.displayProduct();
		
	}

}
