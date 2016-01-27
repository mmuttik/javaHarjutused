package exam.prooviEksamKrister;

import java.util.Arrays;

/**
 * Created by X1 on 24.01.2016.
 */
public class Maatriks_SikkSakk {

    public static void main (String[] args) {
        String [][] maatriks = new String [100][10];

        for (int i = 0; i < maatriks.length; i++) {
            for (int j = 0; j < maatriks[i].length; j++) {

                if (i+j==0 || i-j == 0) {
                    maatriks[i][j] = "x";
                } else if (i+j==18 || i-j == 18) {
                    maatriks[i][j] = "x";
                } else if (i+j==36 || i-j == 36) {
                    maatriks[i][j] = "x";
                } else if (i+j==54 || i-j == 54) {
                    maatriks[i][j] = "x";
                } else if (i+j==72 || i-j == 72) {
                    maatriks[i][j] = "x";
                } else if (i+j==90 || i-j == 90) {
                    maatriks[i][j] = "x";
                }  else {
                    maatriks[i][j] = " ";
                }
            }
            System.out.println(Arrays.toString(maatriks[i]));
        }
    }

    // Teine versioon

       /*public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {

            int m = i;
            while (m>18)
                m = m-18;

            if (m < 10) {
                for (int j = 0; j < 10; j++) {
                    if (j == m) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            if (m > 9) {
                for (int j = 0; j < 10; j++) {
                    if (j == 18 - m) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }*/

}
