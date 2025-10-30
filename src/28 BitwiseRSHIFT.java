//28: Create a program that shows bitwise right shift operator.

import java.util.Scanner;

class BitwiseRSHIFT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number  : ");
        int a = sc.nextInt();
        sc.close();

        int rshift = a >> 1;
        System.out.println(a + " >>" + " 1" + " = " + rshift);
    }
}