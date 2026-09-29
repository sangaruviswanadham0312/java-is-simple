package javaConditionalStatements;

import java.util.Scanner;

public class CountEvenDigits {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a Number:");
			int n= sc.nextInt();
			int count=0;
			for(;n>0;n=n/10) {
				int digit=n%10;
				if(digit%2==0) {
					count++;
				}
			}
			System.out.println("Number of Even Digits:"+count);

	}

}
