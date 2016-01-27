package jpoial;

public class Lineaarne {

   public static void main (String[] sss) {
      int [] bbb = new int[] {1, 5, 8, 9};
      System.out.println (otsi (bbb, 8));
   } // main

   public static int otsi (int[] a, int otsitav) {
      int tulemus = -1;
      for (int i=0; i<a.length; i++) {
         if (otsitav == a[i]) {
            tulemus = i;
            break;
         }
      }
      return tulemus;
   } // otsi

} // jpoial.Lineaarne

