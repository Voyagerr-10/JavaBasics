package BasicProblems;//47: Create a program to find the maximum and minimum element in an array.

import utilities.ArrayUtility;

public class q047_MaxMinFinder {
    public static void main(String[] args) {
        System.out.println("----- Maximum & Minimum Finder -----");

        int[] arr = ArrayUtility.inputArray();

        int min = arr[0];
        int max = arr[0];

        for (int i : arr) {
            if (i > max) max = i;
            if (i < min) min = i;
        }

        System.out.println("Maximum Value : " + max);
        System.out.println("Minimum Value : " + min);

    }
}
