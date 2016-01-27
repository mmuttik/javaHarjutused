package other.oopBattleship;

/**
 * Created by rlindstr on 21.11.15.
 * Mere ja laevastiku loomine
 * Kuni on elus laevu, küsi kasutajalt koordinaadid
 * Pommita merd
 * Anna tagasisidet
 * Ütle, kui mäng on läbi
 */
public class Mang {
    public Mang() {
        System.out.println("Start mäng");
        Meri meri = new Meri(10);
        Mangija mangija = new Mangija();

        while (meri.kasOnLaevuElus()) {
            meri.kuvaSeis();
            int[] lask = mangija.kysiLasuKoordinaadid();
            boolean pihtas = meri.kasKeegiSaiPihta(lask);
            if (pihtas) {
                mangija.pihtas();
            }
            else {
                mangija.moodas();
            }

        }
        mangija.gameover();
    }


}