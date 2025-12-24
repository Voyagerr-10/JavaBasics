package BasicProblems;//36: Create a program to find the Greatest Common Divisor of two numbers

// Optimal Approach: Euclid's algorithm
//keep replacing (a,b) with (b,a%b), when a%b becomes 0, b becomes GCD.

import java.util.Scanner;

public class q036_FindGCD2 {
    public static int GCD (int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:- ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        int gcd = GCD(a, b);

        System.out.println("GCD = " + gcd);
    }
}