/*4: Create a program to input NAME
 and respond with "Good Evening, NAME! How's it going?"*/

import java.util.Scanner;

class PrintName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hey! What's your good name? : ");
        String name = sc.nextLine();
        System.out.println("Good Evening, " + name + "! How's it going?");
        sc.close();
    }
}
