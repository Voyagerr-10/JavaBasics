//34: Create a program that computes the sum of digits of an integer.

import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        System.out.println("Sum = " + sum);
    }
}