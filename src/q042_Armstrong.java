//42 : Create a program to check if a number is an Armstrong number.

import java.util.Scanner;
import java.math.*;

public class q042_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        sc.close();

        //calculating the length
        int length = 0;
        if(num == 0) {
            length = 1;
        }

        int org = num;  // saving for comparison
        int temp = num; // for counting the length
        while(temp != 0) {
            temp = temp / 10;
            length++;
        }

        int d;
        int sum = 0;

        for(int i=0; i<length; i++) {
            d = num % 10;
            sum += (int) Math.pow(d, length);
            num = num / 10;
        }

        if(sum == org) {
            System.out.println(org + " is an Armstrong Number.");
        }
        else {
            System.out.println(org + " is NOT an Armstrong Number.");
        }
    }
}