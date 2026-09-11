package javaConditionalStatements;

import java.util.Scanner;

public class Arithmeticoperations {

	public static void main(String[] args) {
		System.out.println("Arithmeticoperations");
		String yn="";
		do {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Number:");
		double d1=sc.nextDouble();
		System.out.println("Enter Second Number:");
		double d2=sc.nextDouble();
		System.out.println("Enter Symbol like + - * / %");
		String symb=sc.next();
		switch(symb) {
		case "+" ->System.out.println("Sum of two number:"+(d1+d2));
		case "-" -> System.out.println("difference of two numbers:"+(d1-d2));
		case "*" -> System.out.println("multipication of two numbers:"+(d1*d2));
		case "/" -> System.out.println("quotiont of two numbers:"+(d1/d2));
		case "%" -> System.out.println("Remindeer of two numbers:"+(d1%d2));
		default ->System.out.println("Invalide symbole plse check again");
		}
System.out.println("Do You Want Continu Y/N");
yn=sc.next();

	}while(yn.equalsIgnoreCase(yn));
		System.out.println("You Click for Exit");
	}
}
