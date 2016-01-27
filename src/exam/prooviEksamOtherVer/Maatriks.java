package exam.prooviEksamOtherVer;

/**
 * Prindi konsooli 10x100 maatriks, kus läheb joon sikk-sakk ülevalt alla.
 *
 * Näide:
 * x
 *  x
 *   x
 *    x
 *     x
 *      x
 *       x
 *        x
 *         x
 *          x
 *         x
 *        x
 *       x
 *      x
 *     x
 *    x
 *   x
 *  x
 * x
 *  x
 *   x
 *    x
 *     x
 *      jne.
 *
 * Kasuta mis iganes tähiseid soovid ülesande lahendamiseks.
 */
public class Maatriks {
    public static void main(String[] args) {

        int alg=1;
        int m=11;
        int n=20;
        int v=20;//väljapole sakk
        int s=2;//sissepoole sakk

        for (int i = alg; i < n; i++) {
            for (int j = alg; j < m; j++) {
               if (i-j==0 || i+j==v){
                    System.out.print("x");
                }else{
                    System.out.print(".");
                }

            }
            System.out.println();
        }

        for (int i = alg; i < n; i++) {
            for (int j = alg; j < m; j++) {
                if (i-j==0 || i+j==v ){
                    System.out.print("x");
                }else{
                    System.out.print(".");
                }

            }
            System.out.println();
        }

        for (int i = alg; i < n; i++) {
            for (int j = alg; j < m; j++) {
                if (i-j==0 || i+j==v ){
                    System.out.print("x");
                }else{
                    System.out.print(".");
                }

            }
            System.out.println();
        }

        for (int i = alg; i < n; i++) {
            for (int j = alg; j < m; j++) {
                if (i-j==0 || i+j==v ){
                    System.out.print("x");
                }else{
                    System.out.print(".");
                }

            }
            System.out.println();
        }

        for (int i = alg; i < n; i++) {
            for (int j = alg; j < m; j++) {
                if (i-j==0 || i+j==v ){
                    System.out.print("x");
                }else{
                    System.out.print(".");
                }

            }
            System.out.println();
        }



    }
}
