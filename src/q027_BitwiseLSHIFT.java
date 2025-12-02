//27: Create a program that shows bitwise left shift operator.

import java.util.Scanner;

public class q027_BitwiseLSHIFT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number  : ");
        int a = sc.nextInt();
        sc.close();

        int lshift = a << 1;
        System.out.println(a + " <<" + " 1" + " = " + lshift);
    }
}