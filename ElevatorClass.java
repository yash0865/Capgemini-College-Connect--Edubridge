package com.edu;

import java.util.Scanner;

class InvalidFloor extends Exception{
	public InvalidFloor(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}
class Elevator{
	private int currentFloor = 1;
	private Scanner sc = new Scanner(System.in);
	
	public void options() {
		boolean exit = false;
		while(!exit) {
			System.out.println("Options : (s)elect floor (f)ire alarm (q)uit");
			System.out.print("Enter s, f or q ==> ");
			char option = Character.toLowerCase(sc.next().charAt(0));
			if(option != 's' && option != 'f' && option !='q') {
				System.out.println("Invalid Option!");

				System.out.println();
			} else {
				switch(option) {
					case 's':
						selectFloor();
						break;
					case 'f':
						fireAlarm();
						break;
					case 'q':
						System.out.println("Exiting the elevator.");
						exit = true;
						sc.close();
						break;
				}
			}
		}
	}

	
	private void selectFloor() {
		System.out.print("Enter the floor that you'd like to go to ==> ");
		int floor = sc.nextInt();
		if(floor < 1 || floor > 10) {
			System.out.println("Invalid floor!");
			System.out.println();
		}else {
			if(floor == currentFloor) {
				System.out.println("That's the floor you're on.");
				System.out.println();
			}
			else if(floor > currentFloor) {
				goUp(floor);
				System.out.println();
			}
			else {
				goDown(floor);
				System.out.println();
			}
		}
		
	}
	
	private void fireAlarm() {
		System.out.println("Danger! You must exit the building now!");
		if(currentFloor != 1) {
			goDown(1);
		}
		System.out.println();
	}
	
	private void goUp(int floor) {
		System.out.print("Going up ");
		for(int i= currentFloor; i<=floor; i++) {
			System.out.print(".." + i);
		}
		System.out.println("..Ding!");
		currentFloor = floor;
	}
	
	private void goDown(int floor) {
		System.out.print("Going down ");
		for(int i= currentFloor; i>=floor; i--) {
			System.out.print(".." + i);
		}
		System.out.println("..Ding!");
		currentFloor = floor;
	}
}

public class ElevatorClass {
	public static void main(String[] args) {
		Elevator elevator = new Elevator();
		elevator.options();
	}
}
