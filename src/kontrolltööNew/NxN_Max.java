package kontrolltööNew;

import java.util.Arrays;

/**
 * Koostada Java meetod, mis genereerib parameetrina etteantud n järgi niisuguse N x N täisarvumaatriksi,
 * mille iga elemendi väärtuseks on maksimaalne selle elemendi reaindeksist ja veeruindeksist.
 */
public class NxN_Max {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(muster(1)));
        System.out.println(Arrays.deepToString(muster(2)));
        System.out.println(Arrays.deepToString(muster(3)));
    }

    private static int[][] muster(int n) {
        int[][] vastus = new int[n][n];
        for (int i = 0; i < vastus.length; i++) {           // i = rida; j= veerg; Võib kirjutada nende asemel ka rida; veerg
            for (int j = 0; j < vastus.length; j++) {
                vastus[i][j] = Math.max(i, j);
            }
        }

        return vastus;
    }
}
