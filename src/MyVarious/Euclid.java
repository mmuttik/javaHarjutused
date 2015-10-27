package MyVarious;

/**
 * Created by kasutaja on 19.10.2015.
 */
public class Euclid {

    public static void main(String[] param) {
        int m = 15;
        int n = 6;
        if (param.length > 1) {
            m = Integer.parseInt(param[0]);
            n = Integer.parseInt(param[1]);
        }
        System.out.println("SYT (" + m + ", " + n
                + ") = " + syt(m, n));
    } // main

    public static int syt(int a, int b) {
        while (b != 0) {
            int j22k = a % b;
            a = b;
            b = j22k;
        }
        return a;
    } // syt

} // Euclid

