package other.introJavaProgramming.chapter4MathCharsString;

/**
 * Created by esta on 12/11/15.
 */
public class Exercise_4_17 {
    public static void main(String[] args) {

        // Display random lowercase letter

        int number = 97 +(int) (Math.random() * 30);

        System.out.println(number);

        char letter = (char) number;

        System.out.println(letter);
    }
}
