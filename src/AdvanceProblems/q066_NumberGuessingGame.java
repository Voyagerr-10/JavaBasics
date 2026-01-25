//66: Create a program using do-while to implement the number guessing game.

package AdvanceProblems;

import java.util.Scanner;

public class q066_NumberGuessingGame {

    static void playGame() {
        Scanner sc = new Scanner(System.in);
        int random = getRandom();
        int num;
        do {
            System.out.print("Choose a Number from 1 to 10: ");
            num = sc.nextInt();
            if (num != random) {
                System.out.println("Wrong guess! Try again.");
            }
        } while (!(random == num));
    }

    static int getRandom() {
        return (int)(Math.random()*(10)+1); //(max-min+1)+min
    }

    public static void main(String[] args) {
        System.out.println("-----The Number Guessing Game-----");

        playGame();

        System.out.println("You Won!");
    }
}