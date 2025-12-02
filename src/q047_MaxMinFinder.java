//47: Create a program to find the maximum and minimum element in an array.

import java.util.Scanner;

public class q047_MaxMinFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array size!");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter elements:-");
        for(int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for (int i : arr) {
            if (i > max) max = i;
            if (i < min) min = i;
        }

        System.out.println("Maximum Value : " + max);
        System.out.println("Minimum Value : " + min);

        sc.close();
    }
}
