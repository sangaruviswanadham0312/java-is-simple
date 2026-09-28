package javaConditionalStatements;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Binary Number");
		int n = sc .nextInt();
		convertBinaryToDecimal(n);

	}
      static void convertBinaryToDecimal(int n) {
    	  int r=0;
    	  int decimal=0;
    	  int base=1;
    	  while(n>0) {
    		  r=n%10;
    		  decimal=decimal+(r*base);
    		  base=base*2;
    		  n=n/10;
    	  }
    	  System.out.println("Your Decimal Number is:"+decimal);
      }
}
