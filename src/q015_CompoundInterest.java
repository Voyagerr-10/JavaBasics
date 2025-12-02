//15: Create a program to calculate Compound Interest

import java.util.Scanner;

public class q015_CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Welcome to Compound Interest Calculator-----");

        System.out.print("Principal Amount : ");
        double p = sc.nextDouble();

        System.out.print("Rate of Interest : ");
        double r = sc.nextDouble();

        System.out.print("Time Interval : ");
        double t = sc.nextDouble();

        sc.close();

        double a = p * Math.pow((1 + r / 100), t); // Final amount
        double ci = a - p;

        System.out.println("Compound Interest = " + ci);
    }
}