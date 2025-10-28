//10: Create a program that takes two numbers and shows result of all arithmetic operations (+-*/%)

import java.util.Scanner;

class Arithmetic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.println("Sum        : " + a + " + " +  b + " = " + (a+b));
        System.out.println("Difference : " + a + " - " +  b + " = " + (a-b));
        System.out.println("Product    : " + a + " * " +  b + " = " + (a*b));
        System.out.println("Quotient   : " + a + " / " +  b + " = " + (a/b));
        System.out.println("Remainder  : " + a + " % " +  b + " = " + (a%b));

        sc.close();
    }
}