package teema1;

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
        int[] namelist = new int[10];
        System.out.println("Sisesta 10 numbrit: ");
        Scanner skanner = new Scanner(System.in);
        int[] namelist = skanner.nextInt();



    }
}


    /*public static void main(String[] args) {

        Scanner skanner = new Scanner(System.in);
        System.out.println("Sisesta 10 numbrit: ");
        int numbrid = skanner.nextInt();
    }

}*/
