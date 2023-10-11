package com.edubridge;

import java.util.Scanner;

public class RectangleStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int row = sc.nextInt();
		System.out.print("Enter no. of columns : ");
		int col = sc.nextInt();
		System.out.println();
		for(int i=1 ; i<=row; i++) {
			for(int j=1; j<=col; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
