// 60: Create a program to find the absolute value of a given integer using ternary

package AdvanceProblems;

import java.util.Scanner;

public class q060_AbsoluteTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Absolute Value Finder-----");
        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        int result = num >=0 ? num : -num;

        System.out.println("Absolute value is : " + result);

        sc.close();
    }
}
