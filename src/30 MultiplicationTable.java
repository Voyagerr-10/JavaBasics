//30: Create a program that prints the multiplication table for a given number.

import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Number: ");
        int num = sc.nextInt();

        System.out.print("Enter number of times: ");
        int limit = sc.nextInt();

        sc.close();

        System.out.println("-----Multiplication Table of " + num + " up to " + limit + " Times-----");

        for(int i = 1; i <= limit; i++) {
            int res = num * i;
            System.out.println(num + " x " + i + " = " + res);
        }
    }
}