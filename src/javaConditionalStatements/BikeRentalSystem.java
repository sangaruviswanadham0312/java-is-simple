package javaConditionalStatements;

import java.util.Scanner;

public class BikeRentalSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number of Customers");
		int customers=sc.nextInt();
		double totalIncome=0;
		for(int i=1;i<=customers;i++) {
		System.out.println("\nCustomers"+i);
		System.out.println("Enter Number of Bikes Rented:");
		int bikes=sc.nextInt();
		double customerBill=0;
		int j=1;
		while(j<=bikes) {
			System.out.println("Enter Rental hours for Bike"+j+":");
			int hours=sc.nextInt();
			double charge=hours*50;
			if(hours>=5) {
				double discount=charge*10/100;
				charge=charge-discount;
			}
			customerBill=customerBill+charge;
			j++;
		}
			System.out.println("Customer"+i+"Bill=Rs"+customerBill);
			totalIncome=totalIncome+customerBill;
	}
            System.out.println("Total Income For the Day=RS"+totalIncome);
}
}
