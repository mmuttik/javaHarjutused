package introJavaProgramming.chapter5Loops;

/**
 * Created by esta on 26/11/15.
 */
public class Exercise_5_18 {
    public static void main(String[] args) {

        patternA();
        System.out.println();
        patternB();
        System.out.println();
        patternC();
        System.out.println();
        patternD();
    }


    private static String patternA() {
        System.out.println("Pattern A");
        String asteriskA = null;
        for (int i = 0; i < 7; i++) {

            asteriskA = "*";

            for (int j = 0; j < i; j++) {

                System.out.print(asteriskA);
            }
            System.out.println();

        }
        return asteriskA;
    }

    private static String patternB() {

        System.out.println("Pattern B");

        String asteriskB = null;

        for (int i = 0; i < 7; i++) {

            asteriskB = "*";

            for (int j = 7; j > i; j--) {

                System.out.print(asteriskB);
            }
            System.out.println();

        }
        return asteriskB;
        
    }

    private static String patternC() {

        System.out.println("Pattern C");

        String asteriskC = null;

        for (int i = 0; i < 7; i++) {

            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            for (int j = 6; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
        return asteriskC;
    }

    private static String patternD() {
        System.out.println("Pattern D");
        String asteriskD = null;

        for (int i = 7; i > 0; i--) {

            for (int s = 1; s < i; s++) {
                System.out.print(" ");
            }
            for (int j = 7; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
        return asteriskD;
    }
}
