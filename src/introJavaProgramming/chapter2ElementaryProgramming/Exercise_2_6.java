package introJavaProgramming.chapter2ElementaryProgramming;

import java.util.Scanner;

/**
 * Created by esta on 19/10/15.
 */
public class Exercise_2_6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 1000.");

        int number = input.nextInt();
        int ones = number % 10;
        int tens = (number % 100 - ones) / 10;
        int hundreds = (number % 1000 - tens - ones) / 100;

        if (number > 999)
            System.out.println("0");
        else if (number > 99)
            System.out.println(ones * tens * hundreds);
        else if (number > 9)
            System.out.println(ones * tens);
        else
            System.out.println(ones);
    }
}