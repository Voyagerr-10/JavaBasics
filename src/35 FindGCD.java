//35: Create a program to find the Greatest Common Divisor of two numbers

//brute force approach

import java.util.Scanner;

class FindGCD {
    static int GCD (int a, int b) {
        for(int i = Math.min(a, b); i > 1; i--) {
            if(a%i == 0 && b%i == 0) {
                return i;
            }
        }
        return 1;
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