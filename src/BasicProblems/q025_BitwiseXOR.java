package BasicProblems;//25: Create a program that shows bitwise XOR of two numbers.

import java.util.Scanner;

public class q025_BitwiseXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number  : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        sc.close();

        int result = a ^ b;
        System.out.println(a + " & " + b + " = " + result);
    }
}