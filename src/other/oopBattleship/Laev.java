package other.oopBattleship;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by rlindstr on 21.11.15.
 * Laev on public konstruktor, mis kutsub välja meetodid
 */
public class Laev {
    private int[] koordinaadid;
    private boolean elus = true;

    public Laev(int mereServaPikkus) {
        System.out.println("Start Laev");
        genereeriKoordinaadid(mereServaPikkus);
    }

    private void genereeriKoordinaadid(int mereServaPikkus) {
        Random rand = new Random();
        int x = rand.nextInt(mereServaPikkus);
        int y = rand.nextInt(mereServaPikkus);
        koordinaadid = new int[] {x, y};
        System.out.println(Arrays.toString(koordinaadid));
    }

    public boolean kasOledElus() {
        return elus;
        //paneme tähele, et see on public
    }

    public boolean kasSaidPihta(int[] lask) {
        if (Arrays.equals(lask, koordinaadid) && elus) {
            elus = false;
            return true;
        }
        return false;
    }

    public int[] annaKoordinaadid() {
        return koordinaadid;
    }
}
