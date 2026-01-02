// 59: Create a program to check if the given number is odd or even using ternary operator.

package AdvanceProblems;

import java.util.Scanner;

public class q059_OddEvenTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Odd or Even Finder-----");
        System.out.print("Enter your number: ");
        int num = sc.nextInt();

         boolean isEven = checkEven(num);

        System.out.println(isEven ? "Even" : "Odd");
    }

    public static boolean checkEven(int num) {
        return num % 2 == 0;
    }
}

// Q: why use extra method instead of directly solving within main?
// A: to demonstrate modularity and reusability.