//21: Create a program that calculates grades based on marks obtained
// A above 90%      B above 75%     C above 60%
// D above 45%      E above 30%     F below 30%

import java.util.Scanner;

class GradeFinder {
    public static void main(String[] args) {
        System.out.println("-----Welcome to Grade Finder-----");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks for each subject:-");
        System.out.print("English: ");
        int eng = sc.nextInt();
        System.out.print("Maths: ");
        int mat = sc.nextInt();
        System.out.print("Physics: ");
        int phy = sc.nextInt();
        System.out.print("Chemistry: ");
        int chem = sc.nextInt();
        System.out.print("Biology: ");
        int bio = sc.nextInt();
        sc.close();

        int total = eng + mat + phy + chem + bio;
        float percentage = (total / 500f) * 100;

        if (percentage > 90) {
            System.out.println("You've secured " + percentage + "% marks\nand obtained A Grade.");
        }
        else if (percentage > 75) {
            System.out.println("You've secured " + percentage + "% marks\nand obtained B Grade.");
        }
        else if (percentage > 60) {
            System.out.println("You've secured " + percentage + "% marks\nand obtained C Grade.");
        }
        else if (percentage > 45) {
            System.out.println("You've secured " + percentage + "% marks\nand obtained D Grade.");
        }
        else if (percentage > 30) {
            System.out.println("You've secured " + percentage + "% marks\nand obtained E Grade.");
        }
        else {
            System.out.println("You've secured " + percentage + "% marks\nand obtained F Grade.");
        }
    }
}