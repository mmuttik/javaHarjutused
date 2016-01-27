package jpoial;//---------------------------------------------------------------------
// Fail jpoial.Isort1.java
//---------------------------------------------------------------------

import java.util.Random;

/**
 * Massiivi sorteerimine pistemeetodil.
 * @author Jaanus Po"ial
 * @version 0.2
 * @since JDK 1.5
 */
public class Isort1 {

   static final int MAXPIKKUS = 100;

   /** Peameetod. */
   static public void main (String[] argumendid) {

      Integer [] juhuarvud = new Integer [MAXPIKKUS];

      Random generaator = new Random();
      // Genereerime juhuslikke taisarve etteantud vahemikust
      for (int i=0; i<juhuarvud.length; i++) {
         juhuarvud [i] = new Integer (generaator.nextInt (30000));
      }

      System.out.println ("\nEnne jarjestamist:");
      for (int i=0; i<juhuarvud.length; i++) {
         System.out.print (juhuarvud [i] + " ");
      }

      pisteSort (juhuarvud);

      System.out.println ("\nPeale jarjestamist:");
      for (int i=0; i<juhuarvud.length; i++) {
         System.out.print (juhuarvud [i] + " ");
      }
      System.out.println();

   } // main() lopp

/**
 * Sorteerime massiivi, mille elemendid realiseerivad
 * liidest Comparable.
 * @param a sorteeritav massiiv.
 */

   static public <T extends Object & Comparable<? super T>> void pisteSort (T[] a) {
      if (a.length < 2) return;
      for (int i=1; i<a.length; i++) {
         T b = a[i];
         int j;
         for (j=i-1; j>=0; j--) {
            if (a[j].compareTo (b) <= 0) break;
            a[j+1] = a[j]; // vabastame pistekoha
         }
         a[j+1] = b; // pistame b kohale
      }
   } // pisteSort() lopp

} // jpoial.Isort1 lopp

// faili lopp

