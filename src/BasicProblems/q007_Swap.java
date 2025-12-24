package BasicProblems;//7: Create a program to swap two numbers using three variables

import java.util.Scanner;

public class q007_Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.println("a = " + a + "\nb = " + b);

        //Swapping
        System.out.println("Swapping...");
        int temp = a; a = b; b = temp;

        System.out.println("a = " + a + "\nb = " + b);

        sc.close();
    }
}