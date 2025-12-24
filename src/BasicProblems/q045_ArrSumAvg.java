package BasicProblems;//45: Create a program to find Sum and Average of all elements in an Array.

import utilities.ArrayUtility;

public class q045_ArrSumAvg {

    public static long sumArr(int[] arr) {
        long sum = 0;
        for(int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static double avgArr(int[] arr, double sum) {
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        System.out.println("----- Array SUM & AVERAGE Calculator -----");

        int[] arr = ArrayUtility.inputArray();      //taking I/P from utility class

        long sum = sumArr(arr);                      //finding sum
        double avg = (double) avgArr(arr, sum);     //finding average

        System.out.println("SUM = " + sum);
        System.out.println("AVERAGE = " + avg);
    }
}
