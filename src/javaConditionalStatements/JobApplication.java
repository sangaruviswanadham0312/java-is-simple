package javaConditionalStatements;

import java.util.Scanner;

public class JobApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== NAUKRI JOB APPLICATION =====");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter your qualification: ");
        String qualification = sc.nextLine();

        System.out.print("Enter your skill: ");
        String skill = sc.nextLine();

        System.out.println("\n===== APPLICATION RESULT =====");

        if (age < 18) {
            System.out.println("Not Eligible");
        }
        else if (!qualification.equalsIgnoreCase("BTech")
                && !qualification.equalsIgnoreCase("MCA")) {
            System.out.println("Not Eligible");
        }
        else if (!skill.equalsIgnoreCase("Java")) {
            System.out.println("Not Eligible for Java Developer");
        }
        else {
            System.out.println("Congratulations " + name);
            System.out.println("You are Eligible for Java Developer Job");
        }

        sc.close();
    }
}
