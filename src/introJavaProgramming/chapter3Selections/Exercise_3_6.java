package introJavaProgramming.chapter3Selections;

import java.util.Scanner;

public class Exercise_3_6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insert your weight in pounds:");

        double weightPounds = input.nextDouble();

        System.out.println("Instert feet:");

        double heightFeet = input.nextDouble();

        System.out.println("Insert inches:");

        double heightInches = input.nextDouble();

        double weightKg = weightPounds * 0.45359237;
        double heightM = heightInches * 0.0254 + heightFeet * 0.3048;
        double bmi = weightKg / Math.pow(heightM, 2);

        System.out.println("Your BMI is " + bmi + ".");

        if (bmi >= 30.0)
            System.out.println("You're obese");
        else if (bmi > 25.0)
            System.out.println("You're overweight.");
        else if (bmi >= 18.5)
            System.out.println("Your weight is normal.");
        else
            System.out.println("You're underweight.");
    }
}
