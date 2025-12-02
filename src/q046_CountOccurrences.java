//46: Create a program to find number of occurrences of an element in an array.

import java.util.Scanner;

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
        System.out.println("--- Element Occurrence Counter ---");

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

        System.out.print("Enter the element you wish to check: ");
        int el = sc.nextInt();

        int count = countOccur(arr, el);

        if(count == 0) {
            System.out.println("This element does not exist in the array!");
        }
        else {
            System.out.println(el + " Occurs " + count + " times in the array.");
        }

        sc.close();
    }
}