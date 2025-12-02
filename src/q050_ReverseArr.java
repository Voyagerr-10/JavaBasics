//50: Create a program to reverse an array.

import java.util.Scanner;
import java.util.Arrays;

public class q050_ReverseArr {

    public static int[] getReverse(int[] arr) {

        int[] newArr = new int[arr.length];

        for(int i=0, j = arr.length-1; i < newArr.length; i++, j--) {
            newArr[i] = arr[j];
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

        System.out.println("Enter elements:-");
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            System.out.print("arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        int[] rev = getReverse(arr);

        System.out.println("Reversed array:-");
        System.out.println(Arrays.toString(rev));

        sc.close();
    }
}
