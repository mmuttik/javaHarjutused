package teema1;

import java.util.ArrayList;

/**
 * prooviEksam.prooviEksamOtherVer.Algoritm:
 * M�ngulaud
 * T�ida laud laevadega
 * K�sida kasutajalt kuhu lasta
 * Pommitamise feedback
 * Kontrollida kas on veel laevu
 * Kui laevad otsas - m�ng l�bi; v�i uuesti sisendi juurde
 */
public class LaevadePommitamineLoeng {


    public static void main(String[] args) {

        generateTable();
        fillTableWithShips();
        askWhereToBomb();
        resultOfBombing();
        anyShipsLeft();
        gameOver(); // if no ships left { end game

    }

    private static void gameOver() {
    }

    private static void anyShipsLeft() {
    }

    private static void resultOfBombing() {
        //Kui kasutaja sai pihta
        //pihtas();
        //kui ei saanud
        //m66das();
    }

    private static void askWhereToBomb() {
    }

    private static void fillTableWithShips() {

    }

    private static void generateTable() {

        //laud = new int[9][9];

        //ArrayList n�ide

        ArrayList a = new ArrayList();
        a.add(7);
        System.out.println(a.toString());

        // Jaanuse n�ide
        /*int [][] m;                       // massiivi kirjeldamine
        m = new int [2][];                // m�lu reserveerimine esimesel tasemel
        // System.out.println (m.length);    // massiivi pikkus (esimene tase)
        m[0] = new int [4];               // m�lu rerveerim. teisel tasemel
        m[0][0] = -8;                     // omistamine elemendile
        m[1] = new int [3];
        m[1][0] = 9;

        // massiivi v2ljastamine for-tsyklite abil
        for (int i=0; i<m.length; i++) {
            for (int j=0; j<m[i].length; j++)
                System.out.print (String.valueOf (m[i][j]) + " ");
            System.out.println();
        } */
    }
}
