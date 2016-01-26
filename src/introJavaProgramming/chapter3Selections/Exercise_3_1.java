package introJavaProgramming.chapter3Selections;

import java.util.Scanner;

public class Exercise_3_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter values for a, b, c.");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant1 = Math.pow(b, 2) - 4 * a * c;

        System.out.println(discriminant1);

        double rootOne = (-b + Math.pow(discriminant1, 0.5)) / (2 * a);
        double rootTwo = (- b - Math.pow(discriminant1, 0.5)) / (2 * a);

        if (discriminant1 == 0) {
            System.out.println(0);
        }
        else if (discriminant1 < 0) {
            System.out.println("The equation has no real roots.");
        }
        else {
            System.out.println(rootOne);
            System.out.println(rootTwo);
        }
    }
}
