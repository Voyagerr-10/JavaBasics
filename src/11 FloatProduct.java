//11: Create a program to calculate product of two floating points numbers

import java.util.Scanner;
class FloatProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        float a = sc.nextFloat();
        System.out.print("Enter Second Number: ");
        float b = sc.nextFloat();

        float product = a*b;
        System.out.print("Product: " + a + " * " + b + " = " + product);
        sc.close();
    }
}