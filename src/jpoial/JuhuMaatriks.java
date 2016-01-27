package jpoial;

public class JuhuMaatriks {

   public static void main (String[] args) {
      double[][] m = juhuMaatriks (7);
      for (int i=0; i < m.length; i++) {
         for (int j=0; j < m[i].length; j++) {
            System.out.print (String.format ("%8.5f", m[i][j]));
         } // for j
         System.out.println();
      } // for i
   } // main

   public static double[][] juhuMaatriks (int n) {
      double[][] res = new double [n][n];
      for (int i=0; i < res.length; i++) {
         for (int j=0; j < res[i].length; j++) {
            res[i][j] = Math.random()*10.;
         } // for j
      } // for i
      return res;
   } // juhuMaatriks

} // jpoial.JuhuMaatriks

