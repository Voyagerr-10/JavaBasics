//17: Create a program that determines if the given number is positive, negative or zero.

import java.util.Scanner;

class CheckSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Number: ");
        int n = sc.nextInt();
        sc.close();

        if(n < 0) {
            System.out.println("Negative");
        }
        else if(n == 0) {
            System.out.println("Zero");
        }
        else {
            System.out.println("Positive");
        }
    }
}