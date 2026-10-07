package javaConditionalStatements;

import java.util.Scanner;

public class BiggestOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Numbner:");
		int a=sc.nextInt();
		System.out.println("Enter Second Number:");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println(a+"is a Big Number");
		}else if(b>a) {
			System.out.println(b+"is a Big Number");
		}else {
			System.out.println("Both Numbers are equl");
		}

	}

}
