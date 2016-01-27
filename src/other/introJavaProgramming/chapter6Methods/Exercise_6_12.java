package other.introJavaProgramming.chapter6Methods;

import java.util.Scanner;

/**
 * Created by esta on 17/01/16.
 */
public class Exercise_6_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter num1");

        int num1 = input.nextInt();

        System.out.println("enter num2");

        int num2 = input.nextInt() + 1;

        System.out.println("enter number per line");

        int numberPerLine = input.nextInt();

        printNumber(num1, num2, numberPerLine);
    }

    public static void printNumber(int num1, int num2, int numberPerLine) {

        int count = num2 - num1;

        for (int i = num1; i < num2; i++) {
            System.out.print(i + " ");
            if (i % numberPerLine == 0) {
                System.out.print("\n");
            }
        }

    }

}
