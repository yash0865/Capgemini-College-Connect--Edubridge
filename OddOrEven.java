package com.edubridge;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		int num ;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + " is even number");
		} else {
			System.out.println(num + " is odd number");
		}
	}
}
