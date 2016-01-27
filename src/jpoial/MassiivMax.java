package jpoial;

public class MassiivMax {

   public static void main (String[] p) {

      // massiivialgati
      int [] a = { 3, -8, 2, 0, -1, 9, -150};
      for (int i=0; i<a.length; i++)
         System.out.print (String.valueOf (a[i]) + " ");
      System.out.println();

      System.out.println ("Suurim element: " + String.valueOf (maks (a)));
   } // main

   public static int maks (int[] m) {
      int res = Integer.MIN_VALUE;
      for (int i=0; i<m.length; i++) {
         if (m[i] > res)
            res = m[i];
      } // for i
      return res;
   } // maks

} // jpoial.MassiivMax

