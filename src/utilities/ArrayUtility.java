package utilities;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();                           //taking size of array

        if (size <= 0) {
            System.out.println("Invalid array size!");
            sc.close();
        }

        int[] arr = new int[size];                        //initializing array
        System.out.println("Enter elements:-");
        for(int i = 0; i < size; i++) {
            System.out.print((i+1) + ". arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }
}
