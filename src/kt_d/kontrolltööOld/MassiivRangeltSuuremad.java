package kt_d.kontrolltööOld;

/**
 * Koostada Java meetod, mis leiab etteantud reaalarvude massiivi d põhjal niisuguste elementide arvu, mis on rangelt suuremad
 * kõigi elementide aritmeetilisest keskmisest (arit.kesk = summa/elementide arv)
 */
public class MassiivRangeltSuuremad {
    public static void main(String[] args) {
        System.out.println(keskmisestParemaid(new double[]{10., 20., 30.}));
    }

    private static int keskmisestParemaid(double[] d) {
        int vastus = 0;
        double summa = 0;
        double keskmine;

        // Leiame massiivi elementide summa
        for (int i = 0; i < d.length; i++) {
            summa = summa + d[i];
        }

        keskmine = summa / d.length;

        // Leiame keskmisest suuremate elementide arvu
        for (int i = 0; i < d.length; i++) {
            if (d[i] > keskmine) {
                vastus++;
            }
        }
        return vastus;
    }
}
