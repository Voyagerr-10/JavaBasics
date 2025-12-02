//41 : Create a program to print the Fibonacci series up to a certain number.

import java.util.Scanner;

public class q041_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Fibonacci series up to " + n + " : ");
        System.out.println(a);

        if (n >= 1) {
            System.out.println(b);
        }

        int c = a + b;

        while (c <= n) {
            System.out.println(c);
            a = b;
            b = c;
            c = a + b;
        }
        sc.close();
    }
}