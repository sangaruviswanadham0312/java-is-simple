package javaConditionalStatements;

import java.util.Scanner;

public class ObtainedMarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Total Marks");
		double marks=sc.nextDouble();
		System.out.println("Enter Total Percentage:");
		double percentage=sc.nextDouble();
		double obtained =(marks*percentage)/100;
		System.out.println("Obtaind Marks:"+obtained);

	}

}
