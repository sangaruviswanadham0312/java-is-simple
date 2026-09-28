package javaConditionalStatements;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int n=sc.nextInt();
	int temp=n;
	int n1=n;
	int count=0;
	while(n1>0) {
		n1=n1/10;
		count++;
	}
	int r=0;
	int sum=0;
	while(n>0) {
		r=n%10;
		n=n/10;
		sum=sum+(int) Math.pow(r, count);
	}
	if(sum==temp) {
		System.out.println(temp+" is a ArmyStrongNumber");
	}else {
		System.out.println(temp+" is not an ArmStrong Number");
	}

	}

}
