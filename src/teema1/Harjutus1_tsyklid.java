package teema1;

/**
 * Kasutades tsükleid, lahendada järgmised ülesanded:
 * 1. Trükkida ekraanile numbrid 10 kuni 1
 * 2. Trükkida ekraanile paaritud arvud vahemikus 0 kuni 10
 * 3. Trükkida ekraanile selline tabel:
 * 0 1 2 3 4 5 6 7 8 9
 * 1 2 3 4 5 6 7 8 9 0
 * 2 3 4 5 6 7 8 9 0 1
 * 3 4 5 6 7 8 9 0 1 2
 * 4 5 6 7 8 9 0 1 2 3
 * 5 6 7 8 9 0 1 2 3 4
 * 6 7 8 9 0 1 2 3 4 5
 * 7 8 9 0 1 2 3 4 5 6
 * 8 9 0 1 2 3 4 5 6 7
 * 9 0 1 2 3 4 5 6 7 8
 */
public class Harjutus1_tsyklid {

    // Ülesanne 1 While-loopiga

    public static void main(String[] args) {
        int arv;
        arv = 10;
        while (arv > 0) {
            System.out.print(arv + " ");
            arv--;
        }
        // for-loopiga
        System.out.println("\n");             // Taane
        for (arv = 10; arv > 0; arv--) {
            System.out.print(arv + " ");
        }
        // Ülesanne 2 (printida paaritud numbrid)
        System.out.println("\n");
        for (arv = 2; arv <= 10; arv = arv + 2) {
            System.out.print(arv + " ");
        }

        //Ülesanne 3 - tabel
        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int tabel = i + j;            //Loob tabeli
                //System.out.print(tabel + " ");        // Enne lahutamist
                if (tabel >= 10) {
                    tabel = tabel - 10;         //Kui number tabelis on üle 10 siis lahutab 10 ja jõuab tagasi algusesse
                }
                // System.out.print("\n");
                System.out.print(tabel + " ");
            }
            System.out.println(); //Iga rida eraldi reale
        }
    }
}






