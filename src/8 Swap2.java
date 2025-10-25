//8: Create a program to swap two numbers using two variables only

import java.util.Scanner;

class Swap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.println("a = " + a + "\nb = " + b);

        //Swapping
        System.out.println("Swapping...");
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a + "\nb = " + b);
        sc.close();
    }
}