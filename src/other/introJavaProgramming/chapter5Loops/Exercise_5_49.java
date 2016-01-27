package other.introJavaProgramming.chapter5Loops;

import java.util.Scanner;

/**
 * Created by esta on 26/11/15.
 */
public class Exercise_5_49 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string.");

        String usersInput = input.nextLine();

        int vowels = usersInput.length() - usersInput.replaceAll("a|e|i|o|u", "").length();

        int consonants = usersInput.length() - vowels;

        System.out.println("The count of all vowels: " + vowels);
        System.out.println("The count of all consonants: " + consonants);
    }
}
