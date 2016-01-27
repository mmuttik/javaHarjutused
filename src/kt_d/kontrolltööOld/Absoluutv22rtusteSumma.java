package kt_d.kontrolltööOld;

/**
 * Koostada Java meetod, mis leiab kahe etteantud reaalarvu absoluutväärtuste summa.
 */
public class Absoluutv22rtusteSumma {
    public static void main(String[] args) {
        System.out.println(absvdeSumma(0., 0.));
        System.out.println(absvdeSumma(10., 0.));
        System.out.println(absvdeSumma(10., 10.));
    }

    private static double absvdeSumma(double a, double b) {
        return Math.abs(a) + Math.abs(b);
    }
}
