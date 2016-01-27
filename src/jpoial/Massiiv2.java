package jpoial;

public class Massiiv2 {

   public static void main (String[] p) {
      int [][] m;                       // massiivi kirjeldamine
      m = new int [2][];                // m2lu reserveerimine esimesel tasemel
      System.out.println (m.length);    // massiivi pikkus
      m[0] = new int [4];               // m2lu rerveerim. teisel tasemel
      m[0][0] = -8;                     // omistamine elemendile
      m[1] = new int [3];
      m[1][0] = 9;

      // massiivi v2ljastamine for-tsyklite abil
      for (int i=0; i<m.length; i++) {
         for (int j=0; j<m[i].length; j++)
            System.out.print (String.valueOf (m[i][j]) + " ");
         System.out.println();
      } // for i
      System.out.println();

   } // main

} // jpoial.Massiiv2

