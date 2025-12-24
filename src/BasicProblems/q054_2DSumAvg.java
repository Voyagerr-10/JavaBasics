package BasicProblems;//54: Create a program to do sum and average of all elements in a 2D array.

import java.util.Scanner;

public class q054_2DSumAvg {
    public static int getSum(int[][] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows (n): ");
        int n = sc.nextInt();

        System.out.print("Enter number of columns (m): ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("arr[" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = getSum(arr);
        double avg = (double) sum/(n*m);

        System.out.println("SUM = " + sum);
        System.out.println("AVERAGE = " + avg);
        sc.close();
    }
}
