//63: Create a program to create a simple calculator that uses a switch statement
//    to perform basic arithmetic operations:-
//    addition, subtraction, multiplication and division.

package AdvanceProblems;

import java.util.Scanner;

public class q063_SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Simple Calculator-----");

        System.out.println("Which Operation do you wish to perform?");
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");

        int ch = sc.nextInt();

        if(ch < 1 || ch > 4) {
            System.out.println("Invalid Input!");
            return;
        }

        System.out.println("Enter your Numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        switch (ch) {
            case 1 :
                System.out.println(num1+num2);
                break;
            case 2 :
                System.out.println(num1-num2);
                break;
            case 3 :
                System.out.println(num1*num2);
                break;
            case 4 :
                System.out.println(num1/num2);
                break;
            default :
                System.out.println(-1);
                break;
        }
    }
}
