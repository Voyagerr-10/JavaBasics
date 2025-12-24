package BasicProblems;//18: Create a program that determines the greatest of the three numbers.

import java.util.Scanner;

public class q019_GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers:- ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        sc.close();

        if (n1 >= n2 && n1 >= n3) {
            System.out.println(n1 + " is Greatest");
        }
        else if (n2 >= n1 && n2 >= n3) {
            System.out.println(n2 + " is Greatest");
        }
        else {
            System.out.println(n3 + " is Greatest");
        }
    }
}