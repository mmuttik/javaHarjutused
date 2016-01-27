package praktikumid.teema1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
        System.out.println("Vali tegevus: 1 (numbrid), 2 (soned) voi 3 (veel numbreid)");
        Scanner klaviatuur = new Scanner(System.in);
        int mang = klaviatuur.nextInt();
        if (mang == 1) {
            numbrid();
        } else if (mang == 2) {
            soned();
        } else if (mang == 3) {
            numberkuninull();
        }

    }

    public static void soned() {

        String[] sonerida = new String[10];
        Scanner klaviatuur = new Scanner(System.in);
        System.out.println("Sisesta 10 sona");

        int count = 1;
        while (count < 11) {
            System.out.println("Sisesta sone nr " + count);
            sonerida[count - 1] = klaviatuur.next();
            count = count + 1;

        }
        System.out.println("Sisestasid soned: ");
        System.out.println(Arrays.toString(sonerida));
        Arrays.sort(sonerida);
        System.out.println("Sorteerisin need tahestiku jargi: ");
        System.out.println(Arrays.toString(sonerida));

    }

    public static void numbrid() {

        int[] arvurida = new int[10];
        Scanner klaviatuur = new Scanner(System.in);
        System.out.println("Sisesta 10 numbrit");

        int count = 1;
        while (count < 11) {
            System.out.println("Sisesta arv nr " + count);
            arvurida[count - 1] = klaviatuur.nextInt();
            count = count + 1;

        }
        System.out.println("Sisestasid arvud: ");
        System.out.println(Arrays.toString(arvurida));
        Arrays.sort(arvurida);
        System.out.println("Sorteerisin need suuruse jargi: ");
        System.out.println(Arrays.toString(arvurida));

    }

    public static void numberkuninull() {
        int katse;
        //massiivile on vaja panna umbmaarane vaartus!
        ArrayList paljunumbreid = new ArrayList();
        Scanner klaviatuur = new Scanner(System.in);
        System.out.println("Sisesta numbreid nii palju, kui tahad. Kui enam ei jaksa, sisesta 0.");
        katse = 1;

        do {

            System.out.println("Sisesta number nr " + katse);
            paljunumbreid.add(klaviatuur.nextInt());
            katse = katse + 1;
        } while (!paljunumbreid.contains(0));
        System.out.println("Sisestasid arvud: ");
        System.out.println(paljunumbreid);
        Collections.sort(paljunumbreid);
        System.out.println("Sorteerisin need suuruse jargi: ");
        System.out.println(paljunumbreid);
    }
}
