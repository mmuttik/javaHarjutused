package jpoial;

public class Massiiv1 {

   public static void main (String[] p) {
      int [] m;                       // massiivi kirjeldamine
      m = new int [10];               // m2lu reserveerimine massiivile
      System.out.println (m.length);  // massiivi pikkus
      m[0] = 3;                       // omistamine elemendile indeksiga 0
      m[1] = -8;

      // massiivi v2ljastamine for-tsykli abil
      for (int i=0; i<m.length; i++)
         System.out.print (String.valueOf (m[i]) + " ");
      System.out.println();

      // massiivialgati
      int [] a = { 3, -8, 0, 0, -1, 0, 0};
      for (int i=0; i<a.length; i++)
         System.out.print (String.valueOf (a[i]) + " ");
      System.out.println();

   } // main

} // jpoial.Massiiv1

