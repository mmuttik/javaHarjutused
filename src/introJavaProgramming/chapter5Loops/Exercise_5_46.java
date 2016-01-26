package introJavaProgramming.chapter5Loops;

import java.util.Scanner;

/**
 * Created by esta on 26/11/15.
 */
public class Exercise_5_46 {
    public static void main(String[] args) {

        Scanner enterString = new Scanner(System.in);

        System.out.println("Enter a string.");

        String usersString = enterString.nextLine();

        int length = usersString.length();

        String reverseString = "";

        for (int i = length - 1; i >= 0; i--) {
            reverseString = reverseString + usersString.charAt(i);
        } System.out.println(reverseString);

        }

    }