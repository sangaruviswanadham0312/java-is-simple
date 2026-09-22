package javaConditionalStatements;

import java.util.Scanner;

public class NthPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Nth Number:");
        int n = sc.nextInt();
        int count = 0;   
        for (int num = 2; ; num++) {
            int factors = 0; 
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    factors++;
                }
            }        
            if (factors == 2) {
                count++;
                if (count == n) {
                	System.out.println("Nth Prime Number = " + num);
                    break; 
                }
                
            }
        }
        sc.close();
    }
}