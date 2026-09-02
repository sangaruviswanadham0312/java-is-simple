package javaprogramming;

import java.util.Scanner;

public class zoomCarRentals {
	String companyName() {
		return "ZoomCarRentals";
	}
	String customerName() {
		return "Vishwa";
	}
	int dailyRentalRate() {
		return 1500;
	}
	int baseRentalCharges(int days) {
		return days*dailyRentalRate();
	}
	int insurenceFee() {
		return 1500;
	}
	int totalCoast(int days) {
		return baseRentalCharges(days)+insurenceFee();
	}
	String welcomeMessage() {
		return "Welcome to ZoomCarRentals";
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		zoomCarRentals obj=new zoomCarRentals();
		System.out.println("Enter number of days:");
		int days=sc.nextInt();
		System.out.println("Company Name:"+ obj.companyName());
		System.out.println("Customer Name:"+obj.customerName());
		System.out.println("Daily Rental Rate:"+obj.dailyRentalRate());
		System.out.println("Based Rental Charge:"+obj.baseRentalCharges(days));
		System.out.println("Insurence Fee:"+obj.insurenceFee());
		System.out.println("Total Coast:"+obj.totalCoast(days));
		System.out.println(obj.welcomeMessage());
		
		

	}

}
