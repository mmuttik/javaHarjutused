package introJavaProgramming.chapter3Selections;

import java.util.Scanner;

public class Exercise_3_9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the filing status: 1 (single), 2 (married filing jointly ow widower), 3 (married filing separately), 4 (head of household).");

        int status = input.nextInt();

        System.out.println("Enter your income.");

        int income = input.nextInt();

        if (status == 1) {
            if (income > 372950) {
                System.out.println("Your taxes are " + income * 0.35);
            } else if (income > 171550) {
                System.out.println("Your taxes are " + income * 0.33);
            } else if (income > 82250) {
                System.out.println("Your taxes are " + income * 0.28);
            } else if (income > 33950) {
                System.out.println("Your taxes are " + income * 0.25);
            } else if (income > 8350) {
                System.out.println("Your taxes are " + income * 0.15);
            } else System.out.println("Your taxes are " + income * 0.10);
        }
        else if (status == 2) {
            if (income > 372950) {
                System.out.println("Your taxes are " + income * 0.35);
            } else if (income > 208850) {
                System.out.println("Your taxes are " + income * 0.33);
            } else if (income > 137050) {
                System.out.println("Your taxes are " + income * 0.28);
            } else if (income > 67900) {
                System.out.println("Your taxes are " + income * 0.25);
            } else if (income > 67900) {
                System.out.println("Your taxes are " + income * 0.15);
            } else System.out.println("Your taxes are " + income * 0.10);
        }
        else if (status == 3) {
            if (income > 186475) {
                System.out.println("Your taxes are " + income * 0.35);
            } else if (income > 104425) {
                System.out.println("Your taxes are " + income * 0.33);
            } else if (income > 68525) {
                System.out.println("Your taxes are " + income * 0.28);
            } else if (income > 33950) {
                System.out.println("Your taxes are " + income * 0.25);
            } else if (income > 8350) {
                System.out.println("Your taxes are " + income * 0.15);
            } else System.out.println("Your taxes are " + income * 0.10);
        }
        else if (status == 4) {
            if (income > 372950) {
                System.out.println("Your taxes are " + income * 0.35);
            } else if (income > 190200) {
                System.out.println("Your taxes are " + income * 0.33);
            } else if (income > 117450) {
                System.out.println("Your taxes are " + income * 0.28);
            } else if (income > 45500) {
                System.out.println("Your taxes are " + income * 0.25);
            } else if (income > 11950) {
                System.out.println("Your taxes are " + income * 0.15);
            } else System.out.println("Your taxes are " + income * 0.10);
        }
        else {
            System.out.println("Wrong status.");
        }

    }
}