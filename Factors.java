package com.edubridge;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		
		System.out.println("Factors of "+ n +" :");
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
	}

}
