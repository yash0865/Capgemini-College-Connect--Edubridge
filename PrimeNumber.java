package com.edubridge;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		if(isPrime(n)) {
			System.out.println(n+" is a prime number.");
		}
		else {
			System.out.println(n+" is not a prime number.");
		}
	}
	
	static boolean isPrime(int n) {
		if(n==1) {
			return false;
		}
		for(int i=2; i < (int)n/2; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
