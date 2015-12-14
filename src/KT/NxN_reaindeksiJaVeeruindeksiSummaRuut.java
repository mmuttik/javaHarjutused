package KT;

import java.util.Arrays;

/**
 * Koostada Java meetod, mis genereerib parameetrina etteantud n järgi niisuguse N x N täisarvumaatriksi, mille iga elemendi väärtuseks on selle elemendi
 * reaindeksi ja veeruindeksi summa ruut.
 */
public class NxN_reaindeksiJaVeeruindeksiSummaRuut {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(muster(1)));
//        int[][] res = muster(9);
    }

    public static int[][] muster(int n) {

        int[][] vastus = new int[n][n];
        for (int rida = 0; rida < vastus.length; rida++) {
            for (int veerg = 0; veerg < vastus.length; veerg++) {
                vastus[rida][veerg] = Math.max(rida, veerg);
            }
        }
        return vastus;
    }
}
