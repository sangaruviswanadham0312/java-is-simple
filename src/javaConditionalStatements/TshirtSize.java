package javaConditionalStatements;

import java.util.Scanner;

public class TshirtSize {

	public static void main(String[] args) {
		System.out.println("Welcome To CMR Shopping Mall");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your T-Shirt Size:");
		int size=sc.nextInt();
		switch(size) {
		case 36 ->System.out.println("Based on your t-shirt number size would be small");
		case 40 ->System.out.println("Based on your t-shirt number size is large");
		case 42 ->System.out.println("based on your t-shirt number size would be x-large");
		case 44 ->System.out.println("based on your t-shirt number size would xx-large");
		default ->System.out.println("your t-shirt number is not avaliable on the list");
		}

	}

}
