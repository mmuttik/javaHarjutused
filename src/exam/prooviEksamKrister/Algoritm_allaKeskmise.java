package exam.prooviEksamKrister;

import java.util.Arrays;

/**
 * Sulle antakse ette mitu gruppi tudengite hindeid. Kuna maksimum hinne on
 * tegelikult 60 punkti, pead esiteks kõik suuremad arvud 60 peale ümardama.
 * Teiseks leia mitu tudengit said alla keskmise iga grupi kohta?
 */
public class Algoritm_allaKeskmise {

    // Main klass on ainult sulle endale testimiseks
    public static void main(String[] args) {

        System.out.println(allaKeskmise(new int[]{19, 45, 55, 67, 89}));
        System.out.println(allaKeskmise(new int[]{55, 23, 88, 56, 43, 90, 34}));
        System.out.println(allaKeskmise(new int[]{21, 85, 45}));

    }

    // Siia meetodi sisse kirjuta lahendus.
    private static double allaKeskmise(int[] ints) {

        Arrays.sort(ints);

        // Ümardus
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > 60) {
                ints[i] = 60;
            }
        }

        // Arvutan massiivide summad
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum = sum + ints[i];
        }
        // Leian keskmised: summa / massiivi elementide arv
        double keskmine;
        keskmine = (double) sum / ints.length;
        // Keskmine tuleb 47.8; 47.3; 42.0 (antud punktisummade korral)

        int lugeja = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < keskmine) {
                lugeja++;
            }
        }
        return lugeja;
    }

}
