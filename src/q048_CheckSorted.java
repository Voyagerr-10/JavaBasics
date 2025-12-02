//48: Create a program to check if the given array is sorted.

import java.util.Scanner;

public class q048_CheckSorted {

    public static boolean checkSorted(int[] arr) {
        int min = arr[0];
        for(int i = 0 ; i < arr.length - 1 ; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array size!");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter elements:-");
        for(int i=0; i<n; i++) {
            System.out.print("arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        boolean ch = checkSorted(arr);

        if(ch) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is not sorted.");
        }

        sc.close();
    }
}
