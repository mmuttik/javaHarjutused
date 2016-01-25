package kontrolltööOld;

/**
 * Koostada Java meetod, mis teeb kindlaks, kas etteantud täisarv n on rangelt positiivne paarisarv.
 */
public class PosPaaritu {
    public static void main(String[] args) {
        System.out.println(pospaaar(1));
        System.out.println(pospaaar(-1));
        System.out.println(pospaaar(10));
    }

    private static boolean pospaaar(int n) {
        if (n > 0 && n % 2 == 0) {
            return true;
        }
        return false;
    }
}
