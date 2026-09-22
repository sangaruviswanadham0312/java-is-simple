package javaConditionalStatements;

import java.util.Scanner;

public class NthPerfectNumber {
	static boolean perfect(int n) {
		int sum=0;
		int num=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		return sum==num;
	}
	static void nthPerfect(int n) {
		int count=0;
		for(int num=1;num<=10000;num++) {
			if(perfect(num)) {
				count++;
			}
			if(count==n) {
				System.out.println("Nth Perfect Number:"+num);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		nthPerfect(n);
		

	}

}
