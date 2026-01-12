// 61: Create a program Based on a student's score, categorized as:-
/*     "High"     for  scores  > 80
       "Moderate" for  scores  50-80
       "Low"      for  scores  < 50
 */

package AdvanceProblems;

import java.sql.SQLOutput;
import java.util.Scanner;

public class q061_StudentScoreTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Student Score Board-----");
        System.out.print("Enter your score: ");
        int score = sc.nextInt();

        System.out.println(score > 80 ? "High" : (score >= 50 ? "Moderate" : "Low")); //nested ternary

        sc.close();
    }
}
