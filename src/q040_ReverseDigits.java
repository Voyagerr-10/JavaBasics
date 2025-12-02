//40: Create a program to reverse the digits of a number.

import java.util.Scanner;

public class q040_ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a Number: ");
        int n = sc.nextInt();
        sc.close();

        int rev = 0;

        // handling zero
        if (n == 0) {
            System.out.println("Reversed : 0");
            return;
        }

        // handling negative integers
        int sign = 1;   // store original sign
        if (n < 0) {
            sign = -1;
            n = -n;    // change sign for while loop
        }

        // reverse digits
        while (n > 0) {
            int r = n % 10;     // extracting the digits
            rev = rev * 10 + r; // storing the digits in reverse order
            n = n / 10;
        }

        rev = rev * sign;   // apply sign back

        System.out.println("Reversed : " + rev);
    }
}