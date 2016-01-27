package kontrolltööOld;

/**
 * Koostada Java meetod, mis leiab etteantud reaalarvude massiivi d põhjal niisuguste elementide arvu, mis on rangelt väiksemad
 * kõigi elementide aritmeetlisest keskmisest.
 */
public class MassiivAllaKeskmise {
    public static void main(String[] args) {
        System.out.println(allaKesk(new int[]{10, 20, 30}));
    }

    private static double allaKesk(int[] ints) {
        // Arvutan massiivi elementide summa
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum = sum + ints[i];
        }
        // Leian massiivi elementide keskmise
        double keskmine = (double) sum / ints.length;
        // Keskmine antud massiivil 10+20+30 / 3 = 20

        int lugeja = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < keskmine) {
                lugeja++;
            }
        }
        return lugeja;
    }
}
