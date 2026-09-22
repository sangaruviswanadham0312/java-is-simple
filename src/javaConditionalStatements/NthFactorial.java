package javaConditionalStatements;

import java.util.Scanner;
import java.math.BigInteger;
public class NthFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        BigInteger factorial = BigInteger.ONE;
        for(int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial of " + n + " = " + factorial);
    }
}