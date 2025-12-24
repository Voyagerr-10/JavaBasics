package BasicProblems;// 44: Create a program that Prints patterns using loops

import java.util.Scanner;

public class q044_PrintPatterns3 {
    public static void main(String[] ignoredArgs) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose your Pattern:-");
        System.out.println("1. Right Half Pyramid");
        System.out.println("2. Reverse-Right Half Pyramid");
        System.out.println("3. Left Half Pyramid");
        System.out.print("Enter your Choice : ");

        int choice = sc.nextInt();

        System.out.print("Number of Rows: ");
        int n = sc.nextInt();

        sc.close();

        if (n <= 0) {
            System.out.println("Number of rows should be a positive integer.");
            return;
        }

        switch(choice) {
            case 1:
                System.out.println("\nRight Half Pyramid:");
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            case 2:
                System.out.println("\nReverse Right Half Pyramid:");
                for (int i = 1; i <= n; i++) {
                    for (int j = n; j >= i; j--) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            case 3:
                System.out.println("\nLeft Half Pyramid:");
                for (int i = 1; i <= n; i++) {
                    //Spaces
                    for(int j = n - 1; j >= i; j--) {
                        System.out.print("  ");
                    }
                    //Stars
                    for(int k = 1; k <= i; k++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}