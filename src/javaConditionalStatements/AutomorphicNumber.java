package javaConditionalStatements;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		int original=n;
		int square=n*n;
        int temp=n;
        int digits=0;
        while(temp>0) {
        	digits++;
        	temp=temp/10;
        }
        int diviser=1;
        for(int i=1;i<=digits;i++) {
        	diviser=diviser*10;
        }
        int lastdigit=square%diviser;
        if(lastdigit==original) {
        	System.out.println(original+" is a Automorphic Number");
        }else{
        	System.out.println(original+" is not a Automorphic Number");
        }
	}

}
