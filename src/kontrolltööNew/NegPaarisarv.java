package kontrolltööNew;

/**
 * Koostada Java meetod, mis teeb kindlaks, kas etteantud täisarv n on rangelt negatiivne paarisarv.
 */
public class NegPaarisarv {
    public static void main(String[] args) {
        System.out.println(negPaaris(1));
        System.out.println(negPaaris(-1));
        System.out.println(negPaaris(10));
    }

    private static boolean negPaaris(int i) {
        if (i < 0 && i % 2 == 0) {
            return true;
        }
        return false;
    }
}
