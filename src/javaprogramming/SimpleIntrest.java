package javaprogramming;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		System.out.println("SIMPLE INTREST");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal Amount:");
		double p=sc.nextDouble();
		System.out.println("Enter Time in Years:");
		double t=sc.nextDouble();
		System.out.println("Enter Rate of Intrest:");
		double r=sc.nextDouble();
		double si=(p*t*r)/100;
		double totalamount=p+si;
		System.out.println("Simple Intrest:"+si);
		System.out.println("Total Amount:"+totalamount);
		
	}

}
