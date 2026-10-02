package javaConditionalStatements;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int n=sc.nextInt();
	int original=n;
	boolean duck=false;
	while(n>0) {
		int digit=n%10;
		if(digit==0) {
			duck=true;
			break;
		}
		n=n/10;
		
	}
	if(duck) {
		System.out.println(original+" is a Duck Number");
	}else {
		System.out.println(original+" is a Not a Duck Number");
	}
	}

}
