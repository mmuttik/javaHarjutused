package other.introJavaProgramming.chapter5Loops;

/**
 * Created by esta on 25/11/15.
 */
public class Exercise_5_4 {
    public static void main(String[] args) {

    System.out.printf("%-10s %10s %n", "Inches", "Centimeters");

    int i = 1;

    for (i = 1; i < 11; i++) {
        System.out.printf("%-10s %10s %n", i, (double) (i * 2.54));
    }

    }
}
