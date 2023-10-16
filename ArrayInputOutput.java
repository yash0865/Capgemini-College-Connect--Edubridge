package com.edubridge;

import java.util.Scanner;

public class ArrayInputOutput {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array :");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter "+arr.length+" elements :");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array elements are : ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
