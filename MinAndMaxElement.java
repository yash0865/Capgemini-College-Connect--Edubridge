package com.edubridge;

import java.util.Scanner;

public class MinAndMaxElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array :");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter "+arr.length+" elements :");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i : arr) {
			if(i > max) {
				max = i;
			}
			
			if(i < min) {
				min = i;
			}
		}
		
		System.out.println("Largest element = "+max);
		System.out.println("Smallest element = "+min);
	}
}
