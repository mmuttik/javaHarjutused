package kontrolltööNew;

/**
 * Koostada Java meetod, mis leiab kahe etteantud reaalarvu absoluutväärtuste summa.
 */
public class Absoluutväärtus {
    public static void main(String[] args) {
        System.out.println(absSumma(0., 0.));
        System.out.println(absSumma(10., 10.));
        System.out.println(absSumma(20., 20.));
    }

    private static double absSumma(double v, double v1) {
        return Math.abs(v) + Math.abs(v1);
    }
}
