package teema1;

/**
 * Created by kasutaja on 19.10.2015.
 */
public class Random {
    static double korrutaKolmArvu(double a, double b, double c) {
        return a * b * c;
    }

    static void valjasta(double a, double b, double c) {
        System.out.println("Antud arvud: " + a + ", " + b + ", " + c);
    }

    public static void main(String[] args) {
        double x = 1.5;
        double y = 2.25;
        double z = 3;
        System.out.println("Nende korrutis: " + korrutaKolmArvu(x, y, z));
    }
}

