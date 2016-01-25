package kontrolltööNew;

import java.util.Arrays;

/**
 * Koostada Java meetod, mis genereerib parameetrina etteantud n järgi niisuguse N x N täisarvumaatriksi,
 * mille iga elemendi väärtuseks on minimaalne selle elemendi reaindeksist ja veeruindeksist.
 */
public class NxN_Min {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(muster(1)));
        System.out.println(Arrays.deepToString(muster(2)));
        System.out.println(Arrays.deepToString(muster(3)));
    }

    private static int[][] muster(int n) {
        int[][] vastus = new int[n][n];
        for (int i = 0; i < vastus.length; i++) {
            for (int j = 0; j < vastus.length; j++) {
                vastus[i][j] = Math.min(i, j);

                // Lahendus 2
                /*if (i < j) {
                    vastus[i][j] = i;
                } else {
                    vastus[i][j] = j;
                }*/
            }
        }
        return vastus;
    }
}
