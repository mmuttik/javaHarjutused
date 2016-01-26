package introJavaProgramming.chapter5Loops;

/**
 * Created by esta on 25/11/15.
 */
public class Exercise_5_19 {
    public static void main(String[] args) {
        //Display table heading

        System.out.println("Powers of 3");

        //Display table body

/*        for (int i = 0; i < 9; i++) {

*//*            for (int s = 8; s > i; s--) {
                int random = (int) (Math.pow(3, i));
                System.out.printf("%5d", i);

            }*//*

            for (int j = 0; j < i; j++) {
//                if (i - j > 0) {
//                    System.out.printf("    ");
//                }
                int powerOfThreeBigger = (int) (Math.pow(3, j));
                System.out.printf("%5d", powerOfThreeBigger);
            }
            System.out.println();

        }*/

        for(int i=0;i<16;i++) {
            for(int j=0;j<16-i;j++) {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++) {
                int power = (int) Math.pow(3, i);
                System.out.printf("%4d", power);
            }
            System.out.println();
        }
    }
}
