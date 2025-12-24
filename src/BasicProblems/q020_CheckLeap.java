package BasicProblems;//20: Create a program that determines if a given year is a leap year
// Condition: divisible by 400 OR divisible by 4 but not 100

import java.util.Scanner;

public class q020_CheckLeap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        sc.close();

        if ( (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ) {
            System.out.println("it\'s a Leap Year!");
        }
        else {
            System.out.println("it\'s NOT a Leap Year.");
        }
    }
}