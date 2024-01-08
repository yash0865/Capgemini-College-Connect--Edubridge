package com.codingChallenges;

import java.util.Scanner;

public class EnglishMaths {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		String first = sc.next();
		System.out.println("Enter second number : ");
		String second = sc.next();
		int multiplication = Integer.parseInt(first) * Integer.parseInt(second);
		
		System.out.println(String.valueOf(multiplication));
	}
}
