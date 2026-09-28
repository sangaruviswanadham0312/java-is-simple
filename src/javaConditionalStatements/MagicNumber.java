package javaConditionalStatements;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Number:");
    int n =sc.nextInt();
    int original=n;
    while(n>=10) {
    int sum=0;
    while(n>0) {
    	int digit=n%2;
    	sum=sum+digit;
    	n=n/10;
    }
    n=sum;
    }
	if(n==1) {
		System.out.println(original+":is a Magic Number");
	}else {
		System.out.println(original+":is a Not a Magic Number");
	}

}
}