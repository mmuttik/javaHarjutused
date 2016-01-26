package introJavaProgramming.chapter4MathCharsString;

import java.util.Scanner;

/**
 * Created by esta on 12/11/15.
 */
public class Exercise_4_14_ {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter grade.");

        String letterGrade = input.nextLine();

        if (letterGrade.equals("a") || letterGrade.equals("A")) {
            System.out.println("The numeric value for grade " + letterGrade + " is 4.");
        } else if (letterGrade.equals("b") || letterGrade.equals("B")) {
            System.out.println("The numeric value for grade " + letterGrade + " is 3.");
        } else if (letterGrade.equals("c") || letterGrade.equals("C")) {
            System.out.println("The numeric value for grade " + letterGrade + " is 2.");
        } else if (letterGrade.equals("d") || letterGrade.equals("D")) {
            System.out.println("The numeric value for grade " + letterGrade + " is 1.");
        } else if (letterGrade.equals("f") || letterGrade.equals("F")) {
            System.out.println("The numeric value for grade " + letterGrade + " is 0.");
        }
    }
}
