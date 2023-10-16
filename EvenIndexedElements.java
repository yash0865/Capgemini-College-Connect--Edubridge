package com.edubridge;

import java.util.Scanner;

public class EvenIndexedElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array :");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter "+arr.length+" elements :");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Even indexed elements : ");
		for(int i=0 ; i<arr.length; i++) {
			if((i+1) % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}

}
