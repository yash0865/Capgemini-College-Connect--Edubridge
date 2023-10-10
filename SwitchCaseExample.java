package com.edubridge;

import java.util.Scanner;

class Calculator{
	double n1, n2, ans;
	static Scanner sc = new Scanner(System.in);
	void inputData() {

		System.out.print("Enter two numbers : ");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
	}
	
	void addition() {
		ans = n1 + n2;
		System.out.println("Addition = "+ans);
	}
	
	void subtraction() {
		ans = n1 - n2;
		System.out.println("Subtration = "+ans);
	}
	
	void multiplication() {
		ans = n1 * n2;
		System.out.println("Multiplication = "+ans);
	}
	
	void division() {
		ans = n1 / n2;
		System.out.println("Division = "+ans);
	}
}
public class SwitchCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calculator = new Calculator();
		int choice ;
		
		while(true) {
			System.out.println("------My Menu------");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			System.out.print("Enter your choice (1-4) : ");
			choice =  Calculator.sc.nextInt();
			
			if(choice == 5) {
				System.out.println("Thank you!");
				break;
			}
			
			calculator.inputData();
			
			switch(choice) {
			case 1:
				calculator.addition();
				System.out.println();
				break;
			case 2:
				calculator.subtraction();
				System.out.println();
				break;
			case 3:
				calculator.multiplication();
				System.out.println();
				break;
			case 4:
				calculator.division();
				System.out.println();
				break;
			default:
				System.out.println("Invalid Input!");
			} 
		}

	}

}
