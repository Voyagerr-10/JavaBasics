//6: Create a program to add two numbers using a third variable

import java.util.Scanner;

class Sum2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        //Addition
        int sum = a+b;
        System.out.println("sum = " + sum);

        sc.close();
    }
}