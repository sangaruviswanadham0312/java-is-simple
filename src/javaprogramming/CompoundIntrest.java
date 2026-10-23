package javaprogramming;

import java.util.Scanner;

public class CompoundIntrest {

	public static void main(String[] args) {
		System.out.println("COMPOUND INTREST");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal Amount:");
		double p=sc.nextDouble();
		System.out.println("Enter Time in Years:");
		double t=sc.nextDouble();
		System.out.println("Enter Rate of Intrest:");
		double r=sc.nextDouble();
		double amount=p*Math.pow(1+r/100, t);
		double ci=amount-p;
		System.out.println("Compund Intrest:"+ci);
		System.out.println("Total Amount:"+amount);

	}

}
