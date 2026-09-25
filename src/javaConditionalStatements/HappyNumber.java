package javaConditionalStatements;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int num=n;
		while(num!=1&&num!=4) {
			int sum=0;
		while(num>0) {
			int digit=num%10;
			sum=sum+(digit*digit);
			num=num/10;
		}
		num=sum;
		}
		if(num==1) {
			System.out.println(n+":is a Happy Number");
		}else {
			System.out.println(n+": is Not a Happy Number");
		}
	}

}
