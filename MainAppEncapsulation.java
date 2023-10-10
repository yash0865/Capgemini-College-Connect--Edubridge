package com.edubridge;

import java.util.Scanner;

class Employee{
	
	String name;
	int age;
	float salary;
	char gen;
	
	void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : ");
		//name = scanner.next(); //string single word
		name = sc.nextLine(); //with the space more than one word
		
		System.out.println("Enter age : ");
		age = sc.nextInt(); //int datatype
		
		System.out.println("Enter salary : ");
		salary = sc.nextFloat();
		
		System.out.println("Enter gender (M/F) : ");
		gen = sc.next().charAt(0); 
		
	}
	
	void displayData() {
		System.out.println("Employee Details ");
        System.out.println("Name = "+name);	
        System.out.println("Age = "+age);
        System.out.println("Salary = "+salary);
        System.out.println("Gender = "+gen);
	}
}
public class MainAppEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		//emp.inputData();
		emp.displayData();

	}

}
