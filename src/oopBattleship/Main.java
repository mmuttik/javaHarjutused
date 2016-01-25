package oopBattleship;

/**
 * Created by rlindstr on 21.11.15.
 */
public class Main {

    public static void main(String[] args) {
        new Mang();

    }

    /**
     * Main klass
     * Oskab mängu käivitada;
     *
     * Klass Mäng (vastutav mänguloogika eest)
     * Oskab mängu seadistada, Oskab mängu töös hoida, Oskab mängu lõpetada.
     *
     * Klass Mängija (suhtleb kasutajaga; võiks olla ka Mängu klassis - ei muuda käitumist, kuid on lihtsam programmist
     * aru saada ja koodilugemine lihtsam)  Oskab küsida lasu koordinaate; oskab anda tagasisidet, kui lask pihta/mööda; oskab öelda, kui mäng läbi.
     *
     * Klass Meri (tegelikult laevastik, sest merel endal rolli pole)
     * Teab laevu (salvestatud meremassiivi külge, meri suhtleb laevaga),
     * Oskab laevastiku luua (kutsub välja laevaobjekte); Oskab lasku vahendada (küsib, kes pihta sai;
     * Oskab kontrollida, kas on veel elus laevu; Oskab mängu seisu näidata;
     *
     *
     * Klass Laev - teab oma koordinaate; teab, kas ta on pihta saanud või mitte; Oskab pihta saada; Oskab end näidata;
     * oskab endale määrata koordinaadid; Oskab teise laevaga põrkumist kontrollida (ideeliselt, mitte täna);
     * Oskab öelda, kas ta on veel elus.
     *
     * iga klass oskab midagi teha (meetod) või teab midagi (muutuja)
     */

}
