package other.introJavaProgramming.chapter2ElementaryProgramming;

import java.util.Scanner;

public class Exercise_2_7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter minutes.");

        int minutes = input.nextInt();

        int years = minutes / (365 * 24 * 60);
        int minutesLeft = minutes % (365 * 24 * 60);
        int days = minutesLeft / (60 * 24);

        System.out.println(minutes + " is " + years + " and " + days + ".");

    }
}