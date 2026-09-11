package javaConditionalStatements;

import java.util.Scanner;

public class Cricket {

	public static void main(String[] args) {
		System.out.println("main method startd");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Jersey Number:");
		int number=sc.nextInt();
		switch(number) {
		case 7:
			System.out.println("Mahendra Singh Dhoni Jersey number-7");
			System.out.println("The Greate Wicket Keeper");
			System.out.println("Coolest Captain");
			break;
		case 18:
			System.out.println("Virat Kohili Jersey Number -18");
			System.out.println("Consistent Batesman");
			System.out.println("King Kohli");
			break;
		case 45:
			System.out.println("Rohit Sharma Jersey Number-48");
			System.out.println("One Of The Grates Captain");
			break;
		case 77:
			System.out.println("Indian Zen-z Capain");
			System.out.println("jersy number-77");
			break;
		default:
			System.out.println("Number is Not on the list");
		}
         System.out.println("main method endded");
	}

}
