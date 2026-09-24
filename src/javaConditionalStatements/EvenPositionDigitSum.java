package javaConditionalStatements;

import java.util.Scanner;

public class EvenPositionDigitSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		int sum=0;
		int position=1;
		while(n>0) {
			int digit=n%10;
			if(position%2==0) {
				sum=sum+digit;
			}
			n=n/10;
			position++;
		}
     System.out.println("Sum of Digits Even Positions:"+sum);
	}

}
