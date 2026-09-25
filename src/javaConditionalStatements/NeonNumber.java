package javaConditionalStatements;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		int original=n;
		int square=n*n;
        int sum=0;
        while(square>0) {
        	int digit=square%10;
        	sum=sum+digit;
        	square=square/10;
        }
        if(sum==original) {
        	System.out.println(original+": is a Neon Number");
        }else {
        	System.out.println(original+":is a Not a Neon Number");
        }
	}

}
