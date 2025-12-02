//9: Create a program that takes two numbers and shows result of all arithmetic operations (+-*/%)

import java.util.Scanner;

public class q009_Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        sc.close();

        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;

        System.out.println("Addition is       : " + add);
        System.out.println("Subtraction is    : " + sub);
        System.out.println("Multiplication is : " + mul);
        System.out.println("Division is       : " + div);
        System.out.println("Modulus is        : " + mod);
    }
}