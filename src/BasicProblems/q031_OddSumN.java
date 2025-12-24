package BasicProblems;//31: Create a program to sum all odd numbers from 1 to a specified number N.

import java.util.Scanner;

public class q031_OddSumN {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You can calculate the sum of all odd numbers from 1 to N!!");
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        sc.close();

        //Using Brute Force Approach
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("SUM : " + sum);
    }
}