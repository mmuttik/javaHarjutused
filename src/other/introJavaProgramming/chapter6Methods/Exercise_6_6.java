package other.introJavaProgramming.chapter6Methods;

import java.util.Scanner;

/**
 * Created by esta on 17/01/16.
 */
public class Exercise_6_6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int n = input.nextInt() + 1;

        displayPattern(n);
    }

    public static void displayPattern(int n) {

        for (int i = 1; i < n; i++) {
            System.out.println(i);
        }

    }
}
