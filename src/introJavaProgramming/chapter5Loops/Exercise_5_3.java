package introJavaProgramming.chapter5Loops;

import static java.lang.Math.round;

/**
 * Created by esta on 20/11/15.
 */
public class Exercise_5_3 {
    public static void main(String[] args) {

        System.out.printf("%-10s %10s %n", "Celsius", "Fahrenheit");

        double i = 0;

        for (i = 0; i < 101; i+= 2) {
            System.out.printf("%-10s %10s %n", ((int) i), ((i * 9 / 5 + 32) * 10) / 10.0 );
        }
    }
}
