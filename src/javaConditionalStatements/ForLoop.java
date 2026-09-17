package javaConditionalStatements;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		 System.out.println("=================");
// 1.Write a Java program to print numbers from 1 to 20 using a for loop.
		  for (int i = 1; i <= 20; i++) {
	            System.out.print(i + " ");
	            System.out.println();
	        }
// 2.Write a Java program to print all even numbers from 1 to 50 using a for loop.
		  System.out.println("=================");
		  for (int i = 1; i <= 50; i++) {

	            if (i % 2 == 0) {
	                System.out.print(i + " ");
	            }
	        }
// 3.Write a Java program to find the sum of all numbers from 1 to N that are divisible by both 3 and 5 using a for loop.
		  
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter N:");
	        int n = sc.nextInt();

	        int sum = 0;

	        for (int i = 1; i <= n; i++) {

	            if (i % 3 == 0 && i % 5 == 0) {
	                sum = sum + i;
	            }
	        }
	        
	        System.out.print("Sum = " + sum);
	}
	

}
