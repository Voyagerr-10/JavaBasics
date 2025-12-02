//49: Create a program to return a new array deleting a specific element.

import java.util.Scanner;
import java.util.Arrays;

public class q049_DeleteArr {

    public static int[] deleteElement(int[] arr, int d) {
        int index = -1;

        // find the first occurrence
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == d) {
                index = i;
                break;
            }
        }

        // if not found, return original
        if (index == -1) return arr;

        // new array with size n-1
        int[] newArr = new int[arr.length - 1];

        // copy everything except the deleted element
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == index) continue;
            newArr[j++] = arr[i];
        }

        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array size!");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to delete: ");
        int d = sc.nextInt();

        int[] result = deleteElement(arr, d);

        System.out.println("New Array:");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}

