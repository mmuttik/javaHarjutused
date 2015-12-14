package KT;

/**
 * Koostada Java meetod, mis leiab etteantud reaalarvude massiivi d põhjal niisuguste elementide arvu, mis on rangelt suuremad
 * kõigi elementide aritmeetilisest keskmisest (arit.kesk = summa/elementide arv)
 */
public class MassiivRangeltSuuremad {
    public static void main(String[] args) {
        System.out.println(keskmisestParemaid(new double[]{0., 0., 0.}));
    }

    private static int keskmisestParemaid(double[] d) {
        int vastus = 0;
        double summa = 0;
        double keskmine;

        for (int i = 0; i < d.length; i++) {
            summa = summa + d[i];
        }
        keskmine = summa / d.length;
        for (int i = 0; i < d.length; i++) {
            if (d[i] > keskmine) {
                vastus++;
            }
        }
        return vastus;
    }
}
