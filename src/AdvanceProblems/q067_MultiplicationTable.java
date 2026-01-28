//67: Create a program using for loop multiplication table for a number.

package AdvanceProblems;

import java.util.Scanner;

public class q067_MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Multiplication Table-----");

        System.out.print("Enter your number: ");
        int num = sc.nextInt();
          // Brute force no variable
//        for (int i=1; i<=10; i++) {
//            System.out.println(num*i);
//        }

          // Brute force using a variable
//        for (int i = 1; i <= 10; i++) {
//            int result = num * i;
//            System.out.println(result);
//        }

        // Pretty print final version
        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " * " + i + " = " + result);
        }
    }
}
