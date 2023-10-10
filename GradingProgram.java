package com.edubridge;

import java.util.Scanner;


class Grade{
	char grade;
	
	void inputGrade() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Grade : ");
		grade = Character.toUpperCase(sc.next().charAt(0));
		
	}
	
	void displayGrade() {
		if(grade == 'A') {
			System.out.println("Marks : 80 to 100");
		} 
		else if(grade == 'B') {
			System.out.println("Marks : 60 to 79");
		}
		else if(grade == 'C') {
			System.out.println("Marks : 40 to 69");
		} 
		else if(grade == 'F') {
			System.out.println("Marks : 0 to 39");
		}
		else {
			System.out.println("Invalid input");
		}
	}
}
public class GradingProgram {
	public static void main(String[] args) {
		Grade g = new Grade();
		g.inputGrade();
		g.displayGrade();
	}
}



