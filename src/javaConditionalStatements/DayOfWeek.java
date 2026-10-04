package javaConditionalStatements;

import java.util.Scanner;

public class DayOfWeek {

			 void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				System.out.println("Enter Day:");
				int day = sc.nextInt();

				System.out.println("Enter Month:");
				int month = sc.nextInt();

				System.out.println("Enter Year:");
				int year = sc.nextInt();
				if (month < 3){
					month = month + 12;
					year = year - 1;
				}

				int k = year % 100;
				int j = year / 100;

				int h = (day +(13 * (month + 1))/5 +k +k / 4
						+ j / 4 + 5 * j) % 7;

				switch (h){
				case 0 ->
					System.out.println("Saturday");
				case 1->
					System.out.println("Sunday");
				case 2->
					System.out.println("Monday");
				case 3->
					System.out.println("Tuesday");
				case 4->
					System.out.println("Wednesday");
				case 5->
					System.out.println("Thursday");
				case 6->
					System.out.println("Friday");
				}

				sc.close();
			}
		

	}


