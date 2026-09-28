package javaConditionalStatements;


import java.util.Scanner;

public class OnlineVotingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("       ONLINE VOTING SYSTEM");
        System.out.println("=================================");
        System.out.println("Enter Your Name:");
        String name=sc.next();

        // Ask Age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Check age eligibility
        if (age < 18) {

            System.out.println("Not Eligible for Voting");

        } else {

            // Ask Gender only if age is eligible
            System.out.print("Enter your gender (M/F): ");
            char gender = sc.next().charAt(0);

            // Check gender
            if (gender != 'M' && gender != 'm' &&
                gender != 'F' && gender != 'f') {

                System.out.println("Not Eligible for Voting");

            } else {

                // Ask Voter ID only if gender is eligible
                System.out.print("Enter VoterId No: ");
                String voterIdNo = sc.next();

                // Display candidates
                System.out.println("\n------ Candidate Options ------");
                System.out.println("1. Mark Antony");
                System.out.println("2. John Peter");
                System.out.println("3. Robert");
                System.out.println("4. David");

                System.out.print("\nPress any one option (1-4): ");
                int option = sc.nextInt();

                // Check selected candidate
                if (option == 1) {

                    System.out.println("Vote is Captured for Mark Antony");

                } else if (option == 2) {

                    System.out.println("Vote is Captured for John Peter");

                } else if (option == 3) {

                    System.out.println("Vote is Captured for Robert");

                } else if (option == 4) {

                    System.out.println("Vote is Captured for David");

                } else {

                    System.out.println("Thanks for Voting To NOTA");

                }
            }
        }

        sc.close();
    }
}