package javaConditionalStatements;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		int revers=reverseNumber(n);
        
		if(n==revers) {
        	System.out.println("The given Number is palindrom");
        }else {
        	System.out.println("The Given Number is Not Palindrom");
        }
		System.out.println("The Reverse Number is:"+revers);
	}

	static int reverseNumber(int n) {
		int rev=0;
		int r=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			rev=rev*10+r;
		}
		return rev;
	}

}
