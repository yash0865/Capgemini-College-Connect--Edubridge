package com.edubridge;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		
		double fact = 1;
		for(int i=1; i<=n; i++) {
			fact *= i;
		}
		
		System.out.println("Factorial of "+ n +" : "+fact);
	}

}
