//65: Create a program using do-while to find password checker until a valid password is entered.

package AdvanceProblems;

import java.util.Scanner;

public class q065_PasswordChecker2 {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Password Validator-----");
        System.out.println("Valid Password Rule:-\nPassword should be 8 characters long");

        String password;
        do {
            System.out.print("Please enter a Valid Password: ");
            password = sc.next();
        } while(!isValidPassword(password));

        System.out.println("Your Password is totally Valid!");
    }

    static boolean isValidPassword(String password) {
        return password.length() >= 8;
    }
}
