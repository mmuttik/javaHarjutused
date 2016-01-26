package introJavaProgramming.chapter4MathCharsString;

import java.util.Scanner;

/**
 * Created by esta on 12/11/15.
 */
public class Exercise_4_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length from the center to a vertex.");

        double length = input.nextDouble();

        double side = 2 * length * Math.sin(Math.PI / 5);

        double area = 5 * Math.pow(side, 2) / (4 * Math.tan(Math.PI / 5));

        System.out.printf("The area of the pentagon is %.2f", area);
    }
}
