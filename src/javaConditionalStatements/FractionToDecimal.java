package javaConditionalStatements;

import java.util.Scanner;

public class FractionToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numerator:");
		double Numerator=sc.nextDouble();
		System.out.println("Enter Denominator:");
		double Denominator=sc.nextDouble();
		if(Denominator !=0) {
			double result= Numerator/Denominator;
			System.out.println("Decimal Value is:"+result);
		}else {
			System.out.println("Denominator can not be Zero");
		}

	}

}
