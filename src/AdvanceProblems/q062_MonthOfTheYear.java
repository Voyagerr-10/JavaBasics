//62: Create a program to print the month of the year based on a  number (1-12) input by the user.

package AdvanceProblems;

import java.util.Scanner;

public class q062_MonthOfTheYear {
    static String findMonth(int monthNum) {
        return switch (monthNum) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Number!";
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Month Finder-----");

        System.out.print("Enter your month number : ");
        int monthNum = sc.nextInt();

        String monthName = findMonth(monthNum);
        System.out.println("Your month is " + monthName);
    }
}
