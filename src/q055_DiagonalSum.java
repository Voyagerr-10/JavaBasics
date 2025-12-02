//55: Create a program to find the sum of two diagonal elements.

import java.util.Scanner;

public class q055_DiagonalSum {
    public static int getSum(int[][] arr) {
        int n = arr.length;
        int PDsum = 0;
        int SDsum = 0;

        for (int i = 0; i < n; i++) {
            PDsum += arr[i][i];
            SDsum += arr[i][n - 1 - i];
        }

        return PDsum + SDsum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows (n): ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("arr[" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = getSum(arr);
        System.out.println("Sum of Diagonals = " + sum);
        sc.close();
    }
}
