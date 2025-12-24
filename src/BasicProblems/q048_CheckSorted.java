package BasicProblems;//48: Create a program to check if the given array is sorted.

import utilities.ArrayUtility;

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
        System.out.println("----- Array Sort Checker -----");

        int[] arr = ArrayUtility.inputArray();

        boolean ch = checkSorted(arr);

        if(ch) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is not sorted.");
        }

    }
}
