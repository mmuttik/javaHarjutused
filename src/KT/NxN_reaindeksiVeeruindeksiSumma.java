package KT;

import java.util.Arrays;

/**
 * Koostada Java meetod, mis genereerib parameetrina etteantud n järgi niisuguse N x N täisarvumaatriksi, mille iga elemendi väärtuseks on selle elemendi
 * reaindeksi ja veeruindeksi summa.
 */
public class NxN_reaindeksiVeeruindeksiSumma {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(liitmisTabel(1)));
    }

    private static int[][] liitmisTabel(int n) {
        int[][] massiiv = new int[n][n];
        for (int i = 0; i < massiiv.length; i++) {
            for (int j = 0; j < massiiv.length; j++) {
                massiiv[i][j] = i + j;
            }

        }
        return massiiv;
    }
}
