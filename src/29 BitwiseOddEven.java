//29: Create a program to check if a given number is odd or even using bitwise operators.
// if least significant bit (LSB) is 0 then it is even else odd

import java.util.Scanner;

class BitwiseOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        if ((n & 1) == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}