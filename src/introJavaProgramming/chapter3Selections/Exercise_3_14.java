package introJavaProgramming.chapter3Selections;

import java.util.Scanner;

public class Exercise_3_14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int headOrTails = (int) (Math.random() + 0.5);

        System.out.println("Enter 1 (head) or 0 (tails).");

        int Player = input.nextInt();

        if (Player == headOrTails) {
            System.out.println("You won.");
        }
        else {
            System.out.println("You lost");
        }

    }
}