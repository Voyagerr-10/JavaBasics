package BasicProblems;//51: Create a program to check if an array is a palindrome or not

import java.util.Scanner;

public class q051_PalindromeArr {

    public static int[] getReverse(int[] arr) {

        int[] newArr = new int[arr.length];

        for(int i=0, j = arr.length-1; i < newArr.length; i++) {
            newArr[i] = arr[j];
            j--;
        }

        return newArr;
    }

    public static boolean checkPal(int[] rev, int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(rev[i] != arr[i]) {
                return false;
            }
        }
        return true;
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
        boolean ch = checkPal(rev, arr);

        if(ch) {
            System.out.println("It is a palindrome array.");
        } else {
            System.out.println("It is NOT a palindrome array.");
        }

        sc.close();
    }
}
