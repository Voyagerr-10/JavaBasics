//5: Create a program to add two numbers

import java.util.Scanner;

class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        //Addition
        System.out.println(a + " + " + b + " = " + (a+b));
        sc.close();
    }
}