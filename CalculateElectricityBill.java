package com.edubridge;

import java.util.Scanner;

class ElectricBill{
    String n;
    int units;
    double bill;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the customer: ");
        n = sc.nextLine();
        System.out.print("Enter the number of units consumed: ");
        units = sc.nextInt();
    }

    void calculate() {
        if (units <= 100) {
            bill = units * 2.00;
        } else if (units <= 300) {
            bill = 100 * 2.00 + (units - 100) * 3.00;
        } else {
            bill = 100 * 2.00 + 200 * 3.00 + (units - 300) * 5.00;
            double surcharge = bill * 0.025;
            bill += surcharge;
        }
    }

    void print() {
        System.out.println("Name of the customer: " + n);
        System.out.println("Number of units consumed: " + units);
        System.out.println("Bill amount: Rs." + bill);
    }
}

public class CalculateElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricBill bill = new ElectricBill();
		bill.accept();
		bill.calculate();
		System.out.println();
		bill.print();
	}

}
