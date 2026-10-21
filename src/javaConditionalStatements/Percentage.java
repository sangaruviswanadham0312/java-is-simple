package javaConditionalStatements;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Total Marks:");
		double marks=sc.nextInt();
		System.out.println("Enter Obtained Marks:");
		double obtainmarks=sc.nextInt();
		double percentage=(obtainmarks/marks)*100;
		System.out.println("Percentage:"+percentage+" %");

	}

}
