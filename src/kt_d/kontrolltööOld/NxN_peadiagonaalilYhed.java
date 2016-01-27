package kt_d.kontrolltööOld;

import java.util.Arrays;

/**
 * Koostada Java meetod, mis genereerib parameetrina etteantud n järgi niisuguse N x N täisarvumaatriksi, mille peadiagonaalil on ühed ja ülejäänud avrud on nullid.
 */
public class NxN_peadiagonaalilYhed {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(yhik(3)));
    }

    private static int[][] yhik(int n) {
        int[][] tabel = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    tabel[i][j] = 1;
                } else {
                    tabel[i][j] = 0;

                }

            }
        }
        return tabel;
    }
}
