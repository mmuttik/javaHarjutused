package introJavaProgramming.chapter7Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by esta on 25/01/16.
 */
public class exercise7_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 10 integers separated by comma.");

        String usersInput = input.nextLine();

        String[] inputAsArray = usersInput.split(" ");

        System.out.println(Arrays.toString(inputAsArray));

        int[] inputAsInt = new int[10];

        for (int i = 0; i < inputAsArray.length; i++) {
            inputAsInt[i] = Integer.parseInt(inputAsArray[i]);
        }

        System.out.println(Arrays.toString(inputAsInt));

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < inputAsInt.length; i++) {
            if (inputAsInt[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of odd numbers is " + oddCount);
        System.out.println("Number of even numbers is " + evenCount);

    }
}
