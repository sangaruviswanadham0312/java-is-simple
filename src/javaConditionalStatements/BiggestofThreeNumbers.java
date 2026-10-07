package javaConditionalStatements;

import java.util.Scanner;

public class BiggestofThreeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three Numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c) {
			System.out.println(a+" is a Biggest Number");
		}else if (b>a && b>c) {
			System.out.println(b+" is a Biggest Number");
		} else if(c>a && c>a) {
			System.out.println(c+" is a Biggest Number");
		}else {
			System.out.println("Three Numbers Are equl");
		}

	}

}
