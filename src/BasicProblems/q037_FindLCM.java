package BasicProblems;//37: Create a program to find the Least Common Multiple of two numbers
//Brute Force

import java.util.Scanner;

public class q037_FindLCM {

    public static int LCM (int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        int max = Math.max(a, b);

        for(int i = max; i <= (a*b); i+=max) {
            if(i%a == 0 && i%b == 0) {
                return i;
            }
        }
        return (a*b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:- ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        int lcm = LCM(a, b);

        System.out.println("LCM = " + lcm);
    }
}