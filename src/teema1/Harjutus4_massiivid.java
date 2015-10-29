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
        System.out.println("Sisesta 10 numbrit: ");
        for (int i = 0; i < numbrid.length; i++) {          // Sisestab massiivi mälupesadesse (0-9) kasutaja poolt sisestatud arvud
        }

        Arrays.sort(numbrid);
        for (int i = 0; i < numbrid.length; i++) {
            System.out.print(numbrid[i] + " ");

        }
    }
}



