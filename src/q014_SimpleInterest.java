//14: Create a program to calculate Simple Interest

import java.util.Scanner;

public class q014_SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Welcome to Simple Interest Calculator-----");

        System.out.print("Principal Amount : ");
        double p = sc.nextDouble();

        System.out.print("Rate of Interest : ");
        double r = sc.nextDouble();

        System.out.print("Time Interval : ");
        double t = sc.nextDouble();

        sc.close();

        double si = (p * r * t) / 100;
        System.out.println("Simple Interest = " + si);
    }
}