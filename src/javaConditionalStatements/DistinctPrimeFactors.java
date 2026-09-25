package javaConditionalStatements;

import java.util.Scanner;

public class DistinctPrimeFactors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				boolean isPrime=true;
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
        System.out.println(i+" ");
			}
		}

	}

}
}
