//26: Create a program that shows bitwise Compliment of a number.

import java.util.Scanner;

public class q026_BitwiseComp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number  : ");
        int a = sc.nextInt();
        sc.close();

        int comp = ~a;
        System.out.println(" ~" + a + " = " + comp);
    }
}