package other.introJavaProgramming.chapter3Selections;

import java.util.Scanner;

public class Exercise_3_35 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number.");

        int Number = input.nextInt();

        if (Number % 2 == 0) {
            System.out.println(Number + " is even.");
        }
        else {
            System.out.println(Number + " is odd.");
        }

    }
}