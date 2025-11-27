//37: Create a program to find the Least Common Multiple of two numbers

//Optimal Approach
//LCM = (a*b)/gcd(a,b)

import java.util.Scanner;

class FindLCM {
    static int GCD (int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:- ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        int gcd = GCD(a, b);

        int LCM = (a * b)/gcd;

        System.out.println("LCM = " + LCM);
    }
}