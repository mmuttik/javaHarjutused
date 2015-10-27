package teema1;

import java.util.Random;

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

    // Täringumäng
    public static void main(String[] args) {

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

