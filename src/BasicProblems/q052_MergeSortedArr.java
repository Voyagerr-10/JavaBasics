package BasicProblems;//52: Create a program to merge two sorted arrays.

import java.util.Scanner;
import java.util.Arrays;

public class q052_MergeSortedArr {
    public static int[] getMerged(int[] A, int[] B) {
        int n = A.length, m = B.length;

        //Initializing new Array to store merged values
        int p = n+m;
        int[] C = new int[p];

        int i = 0, j = 0, k=0;  //initializing pointers

        while (k < p) {
            //Adding sorted elements from both A and B to C
            if(i < n && j < m) {
                if(A[i] < B[j]) {
                    C[k++] = A[i++];
                }
                else {
                    C[k++] = B[j++];
                }
            }
            //A exhausted , copy elements left in B to C
            else if(i >= n && j < m) {
                C[k++] = B[j++];
            }
            //B exhausted, copy elements left in A to C
            else {
                C[k++] = A[i++];
            }
        }
        return C;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of First Sorted Array: ");
        int n = sc.nextInt();
        if(n<=0) {
            System.out.println("Invalid array size!");
            sc.close();
            return;
        }
        System.out.println("Enter Elements:-");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("A["+i+"]: ");
            A[i] = sc.nextInt();
        }

        System.out.print("Enter size of Second Sorted Array: ");
        int m = sc.nextInt();
        if(m<=0) {
            System.out.println("Invalid array size!");
            sc.close();
            return;
        }
        System.out.println("Enter Elements:-");
        int[] B = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.print("B["+i+"]: ");
            B[i] = sc.nextInt();
        }

        int[] C = getMerged(A, B);

        System.out.println("Merged Array:-");
        System.out.println(Arrays.toString(C));
        sc.close();
    }
}
