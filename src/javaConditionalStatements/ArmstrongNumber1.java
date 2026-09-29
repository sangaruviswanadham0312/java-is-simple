package javaConditionalStatements;

import java.util.Scanner;

public class ArmstrongNumber1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int n=sc.nextInt();
	int original=n;
	int count=0;
	int temp=n;
	for(;temp>0; temp=temp/10) {
		count++;
	}
	int sum=0;
	n=original;
	for(;n>0;n=n/10) {
		int digit=n%10;
		int power=1;
		for(int i=1;i<=count;i++) {
			power=power*digit;
		}
		sum=sum+power;
	}
	if(sum==original) {
		System.out.println(original+" is a Armstrong Number");
	}else {
		System.out.println(original+" is Not a Armstrong Number");
	}

	}

}
