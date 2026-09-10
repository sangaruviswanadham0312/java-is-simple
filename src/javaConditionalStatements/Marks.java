package javaConditionalStatements;
import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Marks:");
		int marks=sc.nextInt();
		if(marks>=101 || marks<=0) {
			System.out.println("Invalid Marks");
		}else {
			if(marks>=90 && marks<=100) {
				System.out.println("Grade-A");
			}else {
				
			}if(marks>=75 && marks <=89) {
				System.out.println("Grade-B");
			}else {
			}if(marks>=60 && marks<=74) {
				System.out.println("Grade-C");
			}else {
			}if(marks>=40 && marks<=59) {
				System.out.println("Grade-D");
			}else {
				if(marks<39) {
					System.out.println("Fail");
				}
			}
		}
	}
}