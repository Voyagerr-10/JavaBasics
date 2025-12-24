package BasicProblems;//32: Create a program to sum all odd numbers from 1 to a specified number N.

import java.util.Scanner;

public class q032_OddSumN2 {
    static void main (String[] ignoredArgs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You can calculate the sum of all odd numbers from 1 to N!!");
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        sc.close();

        int oddCount = (n + 1) / 2;         //Total odd numbers up to N = (N + 1) / 2
        int oddSum = oddCount * oddCount;   //Sum of k odd numbers up to N = k²

        System.out.println("SUM : " + oddSum);
    }
}