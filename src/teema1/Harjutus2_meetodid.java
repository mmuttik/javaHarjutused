package teema1;

import java.util.Scanner;

/**
 * 1. Kirjutada meetod, mis tagastab parameetrina etteantud arvu kuubi.
 * 2. Kirjutada meetod, mis saab parameetritena kaks arvu (vahemiku) ning
 * tagastab kasutaja sisestatud arvu, juhul kui see on lubatud vahemikus.
 * Senikaua, kui kasutaja sisestab midagi ebasobivat, käseb meetod kasutajal
 * arvu uuesti sisestada.
 */
public class Harjutus2_meetodid {


    // Ülesanne 1&2. Loon main meetodis muutujad ja impordin scanneri.
    public static void main(String[] args) {

        Scanner kasutajaSisestus = new Scanner(System.in);
        int     arv;
        System.out.println("Ül.1 Sisesta täisarv: ");
        arv = kasutajaSisestus.nextInt();
        System.out.println("Arv kuubis: " + arvukuup(arv));
        kasutajaSisestus("Sisesta täisarv: ", 1, 100);   //Ül.2 jaoks
    }

    // Ül.1 lahendus.
    public static int arvukuup(int arv) {
        return (int) Math.pow(arv, 3);      //Math.pow astendamiseks
    }

    //Ülesanne 2. Muudan meetodi voidiks, sest see ei tagasta midagi
    public static void kasutajaSisestus(String kysimus, int min, int max) {
        boolean arvVahemikus = false;
        while (!arvVahemikus) {
            Scanner sisestaTäisarv = new Scanner(System.in);
            System.out.println(kysimus);            //Küsib küsimuse "Sisesta täisarv: "
            int arv = sisestaTäisarv.nextInt();
            if (arv <= min) {
                System.out.println("Sisesta palun suurem täisarv");
            } else {
                if (arv >= max) {
                    System.out.println("Sisesta täisarv, mis väiksem, kui 100");
                } else {
                    System.out.println("Number " + arv + "-ga oled lubatud vahemikus");
                    arvVahemikus = true;
                }
            }
        }
    }
}

