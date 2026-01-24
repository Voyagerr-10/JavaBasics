//64: Create a program using do-while to find password checker until a valid password is entered.

package AdvanceProblems;

import java.util.Scanner;

public class q064_PasswordChecker {
    public static void main(String[] args) {
        System.out.println("-----Login-----");
        Scanner sc = new Scanner(System.in);

        String password = "Pass@1234";
        String pass;

        do {
            System.out.println("Please enter your Password: ");
            pass = sc.nextLine();

            if (!pass.equals(password)) {
                System.out.println("Access Denied!");
            }
        } while (!pass.equals(password));

        System.out.println("Access Granted! You're Logged in.");
    }
}
