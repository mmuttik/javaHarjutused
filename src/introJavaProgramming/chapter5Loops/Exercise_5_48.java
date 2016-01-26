package introJavaProgramming.chapter5Loops;

import java.util.Scanner;

/**
 * Created by esta on 26/11/15.
 */
public class Exercise_5_48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string.");

        String usersInput = input.nextLine();

        int length = usersInput.length();


        for (int i = 1; i < length; i = i + 2) {
            System.out.print(usersInput.charAt(i));
        }
    }
}