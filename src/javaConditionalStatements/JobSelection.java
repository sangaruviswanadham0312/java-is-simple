package javaConditionalStatements;
import java.util.Scanner;
public class JobSelection {

	public static void main(String[] args) {
		System.out.println("Welcom to Linkdin");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age:");
		int age=sc.nextInt();
		if(age>=20 && age<=30) {
			System.out.println("You Are eligiable For the Job");
			System.out.println("Enter Your Education");
			String education =sc.next();
			if(education.equalsIgnoreCase("MCA")) {
				System.out.println("You Are Eligiable For the Job");
				System.out.println("Enter Your percentage:");
				double percentage=sc.nextDouble();
				if(percentage>=75) {
					System.out.println("You Are eligiable for the job");
				System.out.println("Enter You are experience:");
				int experience=sc.nextInt();
				if(experience>1) {
					System.out.println("You Are Eligiable For Ecperience");
				System.out.println("Enter Your Expected Salary:");
				double salary=sc.nextDouble();
				if(salary<=80000) {
					System.out.println("congratulations");
					System.out.println("You are select for the next round");
				}else {
					System.out.println("Your salary expected is to high");
				}
				}else {
					System.out.println("Your Experience was Note Eliagbile For the Job");
				}
				}else {
					System.out.println("you are not eligiable for the job");
				}
			}else {
				System.out.println("You Are Not Eligiable For The Job Better Luck Next Time");
			}
		}else {
			System.out.println("You Are Not Eligiable For The Job");
		}
	}

}
