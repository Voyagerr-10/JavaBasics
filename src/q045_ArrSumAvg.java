//45: Create a program to find Sum and Average of all elements in an Array.

import java.util.Scanner;

public class q045_ArrSumAvg {

    public static int sumArr(int[] arr) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array: ");
        int n = sc.nextInt();                       //taking size of array

        if (n <= 0) {
            System.out.println("Invalid array size!");
            sc.close();
            return;
        }

        int[] arr = new int[n];                     //initializing array with size n
        System.out.println("Enter elements:-");
        for(int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        int sum = sumArr(arr);                      //finding sum
        double avg = (double) sum/n;                //finding average

        System.out.println("SUM = " + sum);
        System.out.println("AVERAGE = " + avg);

        sc.close();
    }
}
