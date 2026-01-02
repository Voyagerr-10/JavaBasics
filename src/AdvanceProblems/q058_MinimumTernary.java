// 58: Create a program to find the minimum of two numbers using ternary operator.

package AdvanceProblems;

import java.util.Scanner;

public class q058_MinimumTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Minimum Finder-----");
        System.out.print("Enter First Number: ");
        int first = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int second = sc.nextInt();

        sc.close();

        int min = findMin(first, second);

        System.out.println(min + " is minimum");
    }

    public static int findMin(int first, int second) {
        return (first < second) ? first : second;
    }
}
