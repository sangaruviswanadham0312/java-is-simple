package javaConditionalStatements;

import java.util.Scanner;

public class PrimeDigitLength {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a Starting Number:");
	int start=sc.nextInt();
	System.out.println("Enter a Ending Number:");
	int end=sc.nextInt();
	for(int n=start;n<=end;n++) {
		if(n<2) {
			continue;
		}
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			if(n>=2&&n<=9) {
				System.out.println(n+"->Single-digit Prime");
			}else if(n>=10&&n<=99) {
				System.out.println(n+"->Double-digit Prime");
			}else if(n>=100&&n<=999) {
				System.out.println(n+"->Triple-digit Prime");
		}else {
			System.out.println(n+"->Higher-length Prime");
			}
		}
	}
    
	}

}
