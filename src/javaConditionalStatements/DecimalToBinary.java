package javaConditionalStatements;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Decimal Number");
		int n=sc.nextInt();
		convertDecimalToBinary(n);

	}
 static void convertDecimalToBinary(int n) {
	 int r=0;
	 String str="";
	 while(n>0) {
		 r=n%2;
		 n=n/2;
		 str=r+str;
	 }
	 System.out.println("Your Binary Number is:"+str);
 }
}
