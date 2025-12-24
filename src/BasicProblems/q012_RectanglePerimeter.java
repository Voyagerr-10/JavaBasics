package BasicProblems;//12: Create a program to calculate perimeter of a rectangle

import java.util.Scanner;

public class q012_RectanglePerimeter {
    public static void main(String[] args) {
        System.out.println("\n-----Perimeter Calculator-----");

        System.out.println("               L         ");
        System.out.println("   -----------------------");
        System.out.println("   |                     |");
        System.out.println(" B |                     | B");
        System.out.println("   |                     |");
        System.out.println("   -----------------------");
        System.out.println("               L         \n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length : ");
        float L = sc.nextFloat();

        System.out.print("Enter Breadth : ");
        float B = sc.nextFloat();

        sc.close();

        float P = 2*(L+B);
        System.out.println("Perimeter : " + P + " units");
    }
}