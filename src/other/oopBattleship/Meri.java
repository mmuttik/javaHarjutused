package other.oopBattleship;

import java.util.Arrays;

/**
 * Meri konstruktor, main klassi asemel. Võtab vastu pikkus ja teeb sellest mereServaPikkus
 */
public class Meri {
    private int mereServaPikkus;
    private Laev[] laevastik = new Laev[5];

    public Meri(int pikkus) {
        System.out.println("Start meri");
        mereServaPikkus = pikkus;
        looLaevastik();
    }

    private void looLaevastik() {
        for (int i = 0; i < laevastik.length; i++) {
            laevastik[i] = new Laev(mereServaPikkus);

        }

    }

    public boolean kasOnLaevuElus() {
        for (Laev laev : laevastik) {
            //ütleb, et iga laeva kohta küsi, kas on elus
            boolean elus = laev.kasOledElus();
            //ei kasuta laeva klassi pihtaSaanud, sest selle väärtuse võib siin pekki keerata. seetõttu ta private.
            if (elus) {
                return true;
            }

        }

        return false;

    }

    public boolean kasKeegiSaiPihta(int[] lask) {
        for (Laev laev : laevastik) {
            boolean pihtas = laev.kasSaidPihta(lask);
            if (pihtas) {
                return true;
            }
        }
        return false;
    }

    public void kuvaSeis() {
        //et testimisel näha, kus laevad on ja kas programm käitub õigesti
        int[][] laud = new int[mereServaPikkus][mereServaPikkus];
        for (Laev laev : laevastik) {
            int[] koordinaadid = laev.annaKoordinaadid();
            boolean elus = laev.kasOledElus();
            int x = koordinaadid[0];
            int y = koordinaadid[1];
            if (elus) {
                laud[y][x] = 1;
                //iga laeva kohta anna tema koordinaadid
            } else {
                laud[y][x] = 2;
                //näitab, kus on pommitatud
            }
        }
        for (int i = 0; i < laud.length; i++) {

        System.out.println(Arrays.toString(laud[i]));}
    }
}