package teema1;

/**
 * 1. Kirjutada meetod, mis tagastab parameetrina etteantud arvu kuubi.
 * 2. Kirjutada meetod, mis saab parameetritena kaks arvu (vahemiku) ning
 *    tagastab kasutaja sisestatud arvu, juhul kui see on lubatud vahemikus.
 *    Senikaua, kui kasutaja sisestab midagi ebasobivat, käseb meetod kasutajal
 *    arvu uuesti sisestada.
 */
public class Harjutus2_meetodid {

    public static void main(String[] args) {
        int arv = 3;
        int arvkuubis = arvukuup (arv);
        System.out.println(arvkuubis);
    }

    public static int arvukuup (int arv) {
        return (int) Math.pow(arv,3);
    }

   // public static int kasutajaSisestus(String kysimus, int min, int max) {
       // return 0;
    }

