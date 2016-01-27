package kt_d.kontrolltööNew;

import java.util.Arrays;

/**
 * Koostada Java meetod, mis genereerib parameetrina etteantud n järgi niisuguse N x N täisarvumaatriksi,
 * mille peadiagonaalil on ühed ja ülejäänud avrud on nullid.
 */
public class NxN_Peadiagonaalil {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(maatriks(10)));
    }

    private static int[][] maatriks(int n) {
        int[][] vastus = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    vastus[i][j] = 1;
                } else {
                    vastus[i][j] = 0;
                }
            }
        }
        return vastus;
    }
}
