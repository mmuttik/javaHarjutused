package kontrolltööOld;

import java.util.Arrays;

/**
 * Koostada Java meetod, mis genereerib parameetrina etteantud n järgi niisuguse N x N täisarvumaatriksi, mille iga elemendi väärtuseks on maksimaalne
 * selle elemendi reaindeksist ja veeruindeksist.
 */
public class NxN_Max {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(muster(2)));
    }

    private static int[][] muster(int n) {
        int[][] vastus = new int[n][n];

        for (int rida = 0; rida < vastus.length; rida++) {
            for (int veerg = 0; veerg < vastus.length; veerg++) {
                vastus[rida][veerg] = Math.max(rida, veerg);

            }
        }
        return vastus;
    }
}

