package prooviEksamOtherVer;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * if, while, int[]
 * Sulle antakse ette mitu gruppi tudengite hindeid. Kuna maksimum hinne on
 * tegelikult 60 punkti, pead esiteks kõik suuremad arvud 60 peale ümardama.
 * Teiseks leia mitu tudengit said üle mediaani?
 */
public class Algoritm {

    // Main klass on ainult sulle endale testimiseks
    public static void main(String[] args) {

        System.out.println(yleMediaani(new int[]{19, 45, 55, 67, 89}));
        System.out.println(yleMediaani(new int[]{55, 23, 88, 56, 43, 90, 34}));
        System.out.println(yleMediaani(new int[]{21, 85, 45}));

    }

    //Siia meetodi sisse kirjuta lahendus.
    private static int yleMediaani(int[] ints) {

        //sorteerib elemendid:
        Arrays.sort(ints);

        //ümardame 60-st suuremad arvud:
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > 60) {
                ints[i] = 60;
            }

        }

        //Mediaan:
        double mediaan = 0;//tähistame mediaani
        int keskmine = ints.length / 2;//elementide rea keskmine
        if (ints.length % 2 == 1) {//Kui jääk on 1 (paaritusarvulise elementide hulga korral)
            mediaan = ints[keskmine];//tagastab mediaani meile
        } else {//Kui meil on paarisarv elemente hulgas, siis mediaaniks on kahe keskmise liikme poolsumma
            mediaan = (ints[keskmine - 1] + ints[keskmine]) / 2.0;
        }

        //System.out.println(mediaan); prindib mediaani meile välja

        //Leiame, mitu tudengit said tulemuse üle mediaani
        int count = 0; //loendur
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > mediaan) {
                count++;
            }
        }
        return count;
    }

}
