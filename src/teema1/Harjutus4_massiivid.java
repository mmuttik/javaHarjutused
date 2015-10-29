package teema1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1. Salvesta kasutajalt 10 numbrit ja sorteeri suuruse järgi. (int[])
 * 2. Salvesta kasutajalt 10 sõne ja sorteeri tähestikulises järjekorras. (String[])
 * 3. Salvesta kasutajalt x arv numbreid, lõpeta küsimine kui number on 0
 * ja sorteeri tulemus suuruse järgi. (ArrayList)
 * <p>
 * main() meetodi saad lühendiga psvm.
 */
public class Harjutus4_massiivid {

    public static void main(String[] args) {
        Scanner sisestus = new Scanner(System.in);
        int[]   numbrid  = new int[10];

        for (int i = 0; i < numbrid.length; i++) {          // Variable i takes the values from 0 to 9

         System.out.println("Sisesta 10 numbrit: ");
            numbrid [i] = sisestus.nextInt();


        Arrays.sort(numbrid);
        for (int i = 0; i < numbrid.length; i++) {
            System.out.println(numbrid[i]);

        }
    }
}


