package javaConditionalStatements;

import java.util.Scanner;

public class LargestPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a First Number:");
		int start=sc.nextInt();
		System.out.println("Enter a Second Number:");
	    int end=sc.nextInt();
	    int LargestPrime=-1;
	    for(int n=start;n<=end;n++) {
	    	boolean isPrime=true;
	    	if(n<2){
	    		isPrime=false;
	    	}
	    	for(int i=2;i<n;i++) {
	    		if(n%i==0) {
	         isPrime=false;
	         break;
	    	}
	    }
	    	if(isPrime) {
	    		LargestPrime=n;
	    		
	    	}
		}
	    if(LargestPrime==-1) {
	    	System.out.println("No Prime Number is not Found");
	    }else {
	    	System.out.println("Smallest Prime Number is:"+LargestPrime);
	    }
	sc.close();

	}

}
