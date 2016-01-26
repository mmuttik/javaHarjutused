package introJavaProgramming.chapter6Methods;

import java.util.Scanner;

/**
 * Created by esta on 17/01/16.
 */
public class Exercise_6_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter password");

        String password = input.nextLine();

        checkValidity(password);

    }

    public static void checkValidity(String password) {
        String validity = "valid password";

        if (password.length() < 11) {
            validity = "invalid password";
        }

        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                validity = "invalid password";
            }
        }

        int count = 0;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                count++;
            }
        }

        if (count < 4) {
            validity = "invalid password";
        }

        System.out.println(validity);

    }
}
