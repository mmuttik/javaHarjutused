package other.introJavaProgramming.chapter6Methods;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by esta on 17/01/16.
 */
public class Exercise_6_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter num1");

        double num1 = input.nextDouble();

        System.out.println("enter num2");

        double num2 = input.nextDouble();

        System.out.println("enter num3");

        double num3 = input.nextDouble();

        displaySortedNumbers(num1, num2, num3);

    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {

        double[] numbers = new double[3];

        numbers[0] = num1;
        numbers[1] = num2;
        numbers[2] = num3;

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

    }
}
