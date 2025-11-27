//39: Create a program to check if a given number is prime.

import java.util.Scanner;

class CheckPrime {
    static boolean isPrime(int n) {
        for(int i = 2; i*i <= n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        sc.close();

        if(n <= 1) {
            System.out.println(n + " is neither Prime nor Composite.");
        } else {
            boolean p = isPrime(n);
            if(p) {
                System.out.println(n + " is a Prime number.");
            } else {
                System.out.println(n + " is a Composite number.");
            }
        }
    }
}
