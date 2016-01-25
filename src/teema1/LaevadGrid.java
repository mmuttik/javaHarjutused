package teema1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kasutaja on 30.10.2015.
 */
public class LaevadGrid {

    static int[][] laud;
    static int     lauaLaius  = 10;
    static int     lauaKorgus = 10;
    static Scanner sc         = new Scanner(System.in);   // Loome scanneri siia, sest kasutame seda paljudes meetodites


    public static void main(String[] args) {

        genereeriLaud();
        paigutaLaevad();
        kysiKasutajalt();
        kontrolliTabamust();
        kasOnLaevuAlles();
        gameover();

    }

    private static void gameover() {
    }

    private static void kasOnLaevuAlles() {

    }

    private static void kontrolliTabamust() {

    }

    private static void kysiKasutajalt() {
        System.out.println("Sisesta x ja y koordinaadid (tyhik vahel): ");
        // Kasutaja sisestas nt 5 ja 6 (eraldatud t�hikutega), selleks loome int x = sisestus.charAt();
        String sisestus = sc.nextLine();
        int    x        = Integer.parseInt(sisestus.substring(0, 1));   // Kasutaja sisestab stringina, l��me int-deks
        int    y        = Integer.parseInt(sisestus.substring(2, 3));
        System.out.println("Kasutaja sisestas x: " + x + " y: " + y);
    }

    private static void paigutaLaevad() {
        for (int i = 0; i < lauaKorgus; i++) {
            for (int j = 0; j < lauaLaius; j++) {
                laud[i][j] = (int) Math.round(Math.random()); // Randomiga genereerime laevad, round �mardab (korrutades randomi nt 0.7-ga saame 1-sid lauale rohkem)
            }
            System.out.println(Arrays.toString(laud[i])); //Prindime laua
        }

    }

    private static void genereeriLaud() {
        // System.out.println("K2ivitan meetodi"); // Testiks, et meetod t��tab
        laud = new int[lauaKorgus][lauaLaius];


    }
}
