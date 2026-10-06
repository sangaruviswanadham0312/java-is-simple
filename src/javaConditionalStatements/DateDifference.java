package javaConditionalStatements;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateDifference {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Date and Time");
        System.out.println("Format: yyyy-MM-dd HH:mm:ss");

        String input = sc.nextLine();
        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime enteredDate = LocalDateTime.parse(input, format);
        LocalDateTime today = LocalDateTime.now();
        Period period = Period.between(
                enteredDate.toLocalDate(),
                today.toLocalDate() );
        LocalDateTime dateAfterPeriod = enteredDate.plus(period);
        Duration duration = Duration.between(dateAfterPeriod, today);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        long totalSeconds = duration.getSeconds();
        long hours = totalSeconds / 3600;
        long minutes = (totalSeconds % 3600) / 60;
        long seconds = totalSeconds % 60;
        long totalDays = Duration.between(
                enteredDate.toLocalDate().atStartOfDay(),
                today.toLocalDate().atStartOfDay()).toDays();
        long weeks = totalDays / 7;
        System.out.println("\nDate Difference:");
        
        System.out.println("Years   : " + years);
        System.out.println("Months  : " + months);
        System.out.println("Days    : " + days);
        System.out.println("Weeks   : " + weeks);
        System.out.println("Hours   : " + hours);
        System.out.println("Minutes : " + minutes);
        System.out.println("Seconds : " + seconds);
        sc.close();
    }
}