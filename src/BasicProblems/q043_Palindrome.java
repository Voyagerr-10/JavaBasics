package BasicProblems;//43: Create a program to check if a given number is Palindrome.

import java.util.Scanner;

public class q043_Palindrome {

    public static int getReverse(int n) {
        int rev = 0;
        while (n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        return rev;
    }

    public static boolean checkPalindrome(int n) {
        return getReverse(n) == n;
    }

    public static void main(String[] ignoredArgs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int n = sc.nextInt();
        sc.close();

        if(n < 0) {
            System.out.println(n + " is not a Palindrome"); //handling negative numbers
        }

        else {
            boolean isPalindrome = checkPalindrome(n);

            if (isPalindrome) {
                System.out.println(n + " is a Palindrome");
            } else {
                System.out.println(n + " is not a Palindrome");
            }
        }
    }
}