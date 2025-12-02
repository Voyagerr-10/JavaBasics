//22: 20.Create a program that categorize a person into different age groups
//Child -> below 13     Adult -> below 60
//Teen -> below 20      Senior-> above 60

import java.util.Scanner;

public class q022_AgeCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Age Group Categorizer -----");

        System.out.print("Please enter your age: ");
        int age = sc.nextInt();
        sc.close();

        if(age > 60) {
            System.out.println("Your age group : Senior");
        }
        else if(age >= 20) {
            System.out.println("Your age group : Adult");
        }
        else if(age >= 13) {
            System.out.println("Your age group : Teen");
        }
        else {
            System.out.println("Your age group : Child");
        }
    }
}