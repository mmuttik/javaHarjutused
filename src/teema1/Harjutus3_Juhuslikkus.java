package teema1;

import java.util.Random;
import java.util.Scanner;

/**
 * Juhuslikkus
 * <p>
 * 1. Kirjutada mäng kull ja kiri.
 * Programm küsib kasutajalt: kas kull või kiri? "Viskab" mündi ja
 * teatab, kas kasutaja arvas õigesti või mitte.
 * Vihje: ära hakka jändama Stringidega, küsi kasutajalt number.
 * <p>
 * 2. Kirjutada liisu tõmbamise programm.
 * Küsida kasutajalt inimeste arv. Väljastada juhuslik number vahemikus 1
 * kuni arv (kaasaarvatud).
 * NB! Kontrollida, et töötab õigesti: st. öeldes mitu korda järjest
 * arvuks 3, peab võimalike vastuste hulgas olema nii ühtesid, kahtesid kui kolmi.
 * <p>
 * 3. Kirjutada täringumäng:
 * Programm viskab kaks täringut mängijale ja kaks täringut endale
 * (arvutile), arvutab mõlema mängija silmade summad ja teatab,
 * kellel oli rohkem.
 */
public class Harjutus3_Juhuslikkus {

    public static void main(String[] args) {

        kullJaKiri();
        liisuTombamine();
        taringuMang();
    }

    private static void kullJaKiri() {

        System.out.println("KULL VÕI KIRI");
        System.out.println("\n");
        Scanner kasutajaSisestus = new Scanner(System.in);
        int     sisestus;
        System.out.println("Kull või kiri?");
        System.out.println("Sisesta 1, kui arvad, et kull; Sisesta 2, kui arvad, et kiri!");
        System.out.println("Sisesta: ");
        sisestus = kasutajaSisestus.nextInt();

        int random = (int) (2 * Math.random() + 1);
        System.out.println("Tulemus: " + random);

        if (random == sisestus) {
            System.out.println("Õige! Sinu võit");
        } else {
            System.out.println("Vale! Kaotasid");
        }
        System.out.println("\n");
    }


    private static void liisuTombamine() {

        System.out.println("TÕMBAME LIISKU");
        System.out.println("\n");
        Scanner kasutajaSisestus = new Scanner(System.in);
        int     sisestus;
        System.out.println("Sisesta inimeste arv: ");
        sisestus = kasutajaSisestus.nextInt();
        int valjund = (int) (Math.random() * sisestus + 1);
        System.out.println("Juhuslik number: " + valjund);
        System.out.println("\n");
    }

    private static void taringuMang() {

        System.out.println("TÄRINGUMÄNG");
        System.out.println("\n");
        Random minu_täring   = new Random();
        Random arvuti_täring = new Random();
        int    number1;
        int    number2;
        int    number3;
        int    number4;

        number1 = 1 + minu_täring.nextInt(6);
        number2 = 1 + minu_täring.nextInt(6);
        number3 = 1 + arvuti_täring.nextInt(6);
        number4 = 1 + arvuti_täring.nextInt(6);
        int minul_kokku   = number1 + number2;
        int arvutil_kokku = number3 + number4;
        System.out.println("Esimene täring: " + number1 + " Teine täring: " + number2 + " Kokku said: " + minul_kokku);
        System.out.println("Esimene täring: " + number3 + " Teine täring: " + number4 + " Arvuti sai kokku: " + arvutil_kokku);

        if (minul_kokku > arvutil_kokku) {
            System.out.println("Sina võitsid skooriga " + minul_kokku);
        } else if (minul_kokku == arvutil_kokku) {
            System.out.println("Viik");
        } else
            System.out.println("Arvuti võitis skooriga " + arvutil_kokku);
    }
}


