package javaConditionalStatements;
// SmallestLargestPrime And Sum of those two numbers
import java.util.Scanner;

public class SmallestLargestPrime {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a First Number:");
    	int start=sc.nextInt();
    	System.out.println("Enter a Second Number:");
    	int end=sc.nextInt();
    	int smallestNumber=-1;
    	int larestNumber=-1;
    	for(int n=start;n<=end;n++) {
    		boolean isPrime=true;
    		if(n<2) {
    			isPrime=false;
    		}
    		for(int i=2;i<n;i++) {
    			if(n%i==0) {
    				isPrime=false;
    				break;
    			}
    		}
    		if(isPrime) {
    			if(smallestNumber==-1) {
    				smallestNumber=n;
    			}
    			larestNumber = n;
    		}
    	}
    	if(smallestNumber==-1) {
    		System.out.println("No Prime Number Found");
    	}else {
    		System.out.println("Smallest Prime Number:"+smallestNumber);
    		System.out.println("Largest Prime Number:"+larestNumber);
    		System.out.println("Sum Of Small&Large Prime Numbers:"+(smallestNumber+larestNumber));
    	}
    }
}