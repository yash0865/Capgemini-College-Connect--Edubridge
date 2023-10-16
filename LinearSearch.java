package com.edubridge;

import java.util.Scanner;

public class LinearSearch {

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
		
		System.out.println("Enter element to find : ");
		int p = sc.nextInt();
		
		int index = -1;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == p) {
				index = i;
				break;
			}
		}
		
		if(index != -1) {
			System.out.println("Position = "+(index+1));
		} else {
			System.out.println("Item not found");
		}

	}

}
