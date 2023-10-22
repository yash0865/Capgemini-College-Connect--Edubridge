package com.edubridge;

import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array :");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter "+arr.length+" elements :");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int largest = arr[0];
		
		for(int i : arr) {
			if(i > largest) {
				largest = i;
			}
		}
		
		int secondLargest = arr[0];
		for(int i : arr) {
			if( i != largest  && i > secondLargest) {
				secondLargest = i;
			}
		}
		
		System.out.println("Second Largest element = "+secondLargest);
	}

}
