package prooviEksamOther;

/**
 * Prindi konsooli 9x9 maatriks selliselt, et
 * joonistub suur X üle laua, nagu bingo diagonaalid.
 * <p>
 * Näide:
 * <p>
 * x       x
 * x     x
 * x   x
 * x x
 * x
 * x x
 * x   x
 * x     x
 * x       x
 * <p>
 * Kasuta mis iganes tähiseid soovid ülesande lahendamiseks.
 */
public class Maatriks_Bingo {

    public static void main(String[] args) {

        String[][] vastus = new String[9][9];
        for (int i = 0; i < vastus.length; i++) {
            for (int j = 0; j < vastus.length; j++) {
                if (i == j || (vastus.length - 1) - i == j) {
                    vastus[i][j] = "#";

                } else {
                    vastus[i][j] = ".";

                }
                System.out.print(vastus[i][j] + " ");
            }
            System.out.println();
        }
    }
}

