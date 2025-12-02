//13: Create a program to calculate area of a triangle

import java.util.Scanner;

public class q013_TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------Area Calculator-------");

        System.out.print("Enter Base: ");
        float B = sc.nextFloat();

        System.out.print("Enter Height: ");
        float H = sc.nextFloat();

        sc.close();

        double A = 0.5 * B * H; // OR (B * H) / 2
        System.out.println("Area = " + A + " units");
    }
}

/*
double A = 1/2 * B * H;
here 1/2 is integral division so it will return 0.0 not 0.5 and area will always be 0
either use 0.5 with double A or use 0.5f with float A
*/