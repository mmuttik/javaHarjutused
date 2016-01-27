package other.introJavaProgramming.chapter5Loops;

/**
 * Created by esta on 25/11/15.
 */
public class Exercise_5_7 {
    public static void main(String[] args) {

        int year = 0;

        double tuition = 10000;

        //Calculate the tuition for the following ten years.

        double sumOfTuition = 0;

        while (year < 15) {
            tuition = tuition * 1.06;
            if (year > 10) {
                sumOfTuition = sumOfTuition + tuition;
            }
            String tuitionString = String.format("%.2f", tuition);
            year++;
            if (year == 10) {
                System.out.println("The tuition in the 10th year is $" + tuitionString + ".");
            }
        }   String sum = String.format("%.2f", sumOfTuition);
            System.out.println("The sum of tuition in the 11th, 12th, 13th and 14th year is $" + sum + ".");

    }
}
