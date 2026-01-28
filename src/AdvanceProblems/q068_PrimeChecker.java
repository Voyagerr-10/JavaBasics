//68: Create a program using for loop to display if a number is prime or not.

package AdvanceProblems;

import java.util.Scanner;

public class q068_PrimeChecker {

    static boolean isPrime(int num) {

        if (num <= 1) return false;

        int limit = (int) Math.sqrt(num);

        for (int i = 2; i <= limit; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Prime Number Checker-----");

        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        if(isPrime(num)) {
            System.out.println("Prime Number.");
        } else {
            System.out.println("Not Prime. ");
        }
    }
}
