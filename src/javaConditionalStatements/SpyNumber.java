package javaConditionalStatements;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		int original=n;
		int sum=0;
		int product=1;
		while(n>0) {
			int digit=n%10;
			sum=sum+digit;
			product=product*digit;
			n=n/10;
		}
		if(sum==product) {
			System.out.println(original+" is a Spy Number");
		}else {
			System.out.println(original+" is Not a Spy Number");
		}
		 System.out.println("Sum = " + sum);
	        System.out.println("Product = " + product);

	}

}
