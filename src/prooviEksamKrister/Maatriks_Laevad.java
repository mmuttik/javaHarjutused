package prooviEksamKrister;

import java.util.Arrays;
import java.util.Random;

/**
 * Pane 10x10 maatriksile kolm kolmekohalist laeva nii, et nad ei kattuks.
 */
public class Maatriks_Laevad {

    static int[][] laud;
    static int [] laev = {1,1,1};

    public static void main(String[] args) {
        genereeriLaud();
        genereeriLaevad();
    }

    private static void genereeriLaevad() {
        int sum = 0;
        for (int i = 0; i < laud.length; i++) {
            for (int j = 0; j < laud.length; j++) {
                laud[i][j] = laev[sum]; // TODO
            }
            System.out.println(Arrays.toString(laud[i]));
        }
    }

    private static void genereeriLaud() {
        laud = new int[10][10];

    }


    // Ühekohaliste laevadega
    /*public static void main(String[] args) {
        int[][] laud = new int[10][10];

        for (int i = 0; i < laud.length; i++) {
            for (int j = 0; j < laud.length; j++) {
                laud[i][j] = laevad();
//                System.out.print(Arrays.toString(laevad[i]) + " ");
                System.out.print(laud[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int laevad() {
        int laev = (int) (Math.random() * 2);
        return laev;
    }*/


}
