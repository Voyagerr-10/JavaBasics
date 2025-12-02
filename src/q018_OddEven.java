//18: Create a program that determines if a number is odd or even.

import java.util.Scanner;

public class q018_OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");;
        int n = sc.nextInt();
        sc.close();

        if(n % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}