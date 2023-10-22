package com.edubridge;

import java.util.Scanner;

public class ReverseArray {

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
		
		System.out.println("Original Array :");
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("Reversed Array : ");
		for(int i=arr.length-1 ; i >=0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
