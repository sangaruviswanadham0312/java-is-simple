package javaConditionalStatements;
import java.util.Scanner;
public class CollegeExamEligibility {

	public static void main(String[] args) {
		System.out.println("Welcome To AITAM");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Attendence:");
        double attendence=sc.nextDouble();
        if(attendence>=75) {
        	System.out.println("Eligiable for exam:");
        	System.out.println("Enter your Total Internal Marks:");
        	int marks=sc.nextInt();
        	if(marks>=70) {
        		System.out.println("Eligiable for the Exam");
        	System.out.println("your Assignment completion Complete say Yes or No");
        	String assignmentcompletion=sc.next();
        	if(assignmentcompletion.equalsIgnoreCase("Yes")) {
        		System.out.println("You Are Eligiable For Exam");
        	System.out.println("Your Fee payment Yes or No");
        	String payment=sc.next();
        	if(payment.equalsIgnoreCase("Yes")) {
        		System.out.println("All THE BEST FOR YOUR EXAM");
        	}else {
        		System.out.println("Please Clear Your Fee Payement");
        	}
        	}else {
        		System.out.println("You are Not Eliagable for Exam");
        	}
        	}else {
        		System.out.println("Not Eliagable for Exam");
        	}
        }else {
        	System.out.println("Not Eligiable for Exam");
        }
	}

}
