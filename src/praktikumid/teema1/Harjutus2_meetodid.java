package praktikumid.teema1;

import java.util.Scanner;

/**
 * 1. Kirjutada meetod, mis tagastab parameetrina etteantud arvu kuubi.
 * 2. Kirjutada meetod, mis saab parameetritena kaks arvu (vahemiku) ning
 * tagastab kasutaja sisestatud arvu, juhul kui see on lubatud vahemikus.
 * Senikaua, kui kasutaja sisestab midagi ebasobivat, käseb meetod kasutajal
 * arvu uuesti sisestada.
 */
public class Harjutus2_meetodid {

    public static void main(String[] args) {
        int kuup = tostaKuupi(3);
        System.out.println(kuup);

        kasutajaSisestus("Mitu tähte on meie päikesesüsteemis?", 0, 1);
    }

    public static int tostaKuupi(int arv) {
        return arv * 3;
    }

    public static int kasutajaSisestus(String kysimus, int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println(kysimus);
        int sisestus = sc.nextInt();
        if (sisestus > min && sisestus <= max) {
            System.out.println("Õige!");
            return sisestus;
        } else {
            System.out.println("Vale vastus, proovi uuesti!");
            return kasutajaSisestus(kysimus, min, max);
        }
    }
}

