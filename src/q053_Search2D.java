//53: Create a program to search an element in a 2D array.

import java.util.Scanner;

public class q053_Search2D {
    public static boolean searchKey(int[][] arr, int key) {
        int n = arr.length;     //get row size
        int m = arr[0].length;  //get column size

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Element found at position: arr[" + i + "][" + j + "]");
                    return true;
                }
            }
        }
        return false;
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

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        if (searchKey(arr, key)) {
            System.out.println("Search successful!");
        } else {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}

