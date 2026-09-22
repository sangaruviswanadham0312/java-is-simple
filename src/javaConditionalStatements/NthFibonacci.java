package javaConditionalStatements;

import java.util.Scanner;

public class NthFibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		if(n==1) {
			System.out.println("Nth Fibonacci Number is:"+a);
		}else if(n==2) {
			System.out.println("Nth Fibonacci Number is:"+b);
		}else {
			for(int i=3;i<=n;i++) {
				int c=a+b;
				a=b;
				b=c;
			}
       System.out.println("Nth Fibonacci number = " + b);
		}

	}

}
