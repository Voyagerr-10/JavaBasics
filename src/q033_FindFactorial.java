//33: Write a function that calculates the factorial of a number.

import java.util.Scanner;

public class q033_FindFactorial {
    public static long factN(int n) {
        long prod = 1;
        for (int i = 1; i <= n; i++) {
            prod *= i;
        }
        return prod;
    }

    public static void main (String[] ignoredArgs) {
        //ignoredArgs instead of args because args is never used
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Factorial Calculator-----");

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        sc.close();

        long f = factN(n);

        System.out.println(n + "! = " + f);
    }
}