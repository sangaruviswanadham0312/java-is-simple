package javaConditionalStatements;

import java.util.Scanner;

public class ArithematicOperations {

	public static void main(String[] args) {
		System.out.println("Arithematic Operations");
		String yn=" ";
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:");
		int a=sc.nextInt();
		System.out.println("Enter Second Number:");
        int b=sc.nextInt();
        System.out.println("Enter Operators: +,-,*,/");
        char operator=sc.next().charAt(0);
        switch(operator) {
        case '+'-> System.out.println("Sum of The Two numbers :"+(a+b));
        case '-'-> System.out.println("Difference of the Two Numbers:"+(a-b));
        case '*'-> System.out.println("Multiplication of the two Numbers:"+(a*b));
        case '/'-> System.out.println("Divisable by Two Numbers:"+(a/b));
        default-> System.out.println("Invalide operator");
        }
        System.out.println("If you want continu Y/N");
        yn=sc.next();
		}while(yn.equalsIgnoreCase("y")) ;
		System.out.println("you Click for exist");
			
		
	}

}
