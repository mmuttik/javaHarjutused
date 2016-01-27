package jpoial;

public class For {

   public static void main (String[] param) {

      double [] dm = {8., 4., 1., 2., 9., 3., 5., 6., 7.};

      for (int i=0; i<9; i++)
         System.out.print (String.valueOf (dm [i]) + "  ");
      System.out.println();

      for (int i = 0, j = 8; i < j; i++, j--) {
         double tmp = dm [i];
         dm [i] = dm [j];
         dm [j] = tmp;
      }

      for (int i=0; i<9; i++)
         System.out.print (String.valueOf (dm [i]) + "  ");
      System.out.println();

   } // main

} // jpoial.For

