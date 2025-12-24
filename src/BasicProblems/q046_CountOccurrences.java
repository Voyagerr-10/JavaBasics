package BasicProblems;//46: Create a program to find number of occurrences of an element in an array.

import java.util.Scanner;
import utilities.ArrayUtility;

public class q046_CountOccurrences {

    public static int countOccur(int[] arr, int element) {
        int count = 0;
        for(int n : arr) {
            if(n == element) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Element Occurrence Counter -----");

        int[] arr = ArrayUtility.inputArray();

        System.out.print("Enter the element you wish to check: ");
        int el = sc.nextInt();

        int count = countOccur(arr, el);

        if(count == 0) {
            System.out.println(el + " doesn't exists in the array!");
        }
        else {
            System.out.println(el + " Occur " + count + " times in the array.");
        }

        sc.close();
    }
}