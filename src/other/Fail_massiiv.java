package other;

import java.io.*;
import java.util.StringTokenizer;

/* Reaalarvumaatriksi lugemine ja kirjutamine faili. */
public class Fail_massiiv {

   /* argum -  sisendfaili_nimi  max_ridade_arv  valjundfaili_nimi */
   public static void main (String[] argum) {
      String fnimi = "andmed.txt";
      if (argum.length > 0)
         fnimi = argum[0];
      int max_ridu = 500;
      if (argum.length > 1)
         max_ridu = Integer.parseInt (argum[1]);
      String onimi = "valjund.txt";
      if (argum.length > 2)
         onimi = argum[2];
      double[][] massiiv;
      massiiv = loemassiiv (fnimi, max_ridu); 
      System.out.println (fnimi + " lugemisel saadud tulemus:");
      for (int i=0; i<massiiv.length; i++) {
         for (int j=0; j<massiiv[i].length; j++) {
            System.out.print (String.valueOf (massiiv[i][j]) + " ");
         }
         System.out.println();
      }
      kirjutamassiiv (massiiv, onimi);
      System.out.println ("Vaata faili " + onimi);
   } // main

   /* f - faili nimi; m - maksimaalne ridade arv */
   public static double[][] loemassiiv (String f, int m) {
      double[][] ajutine = new double [m][];
      int r = 0;
      String rida = null;
      try {
         BufferedReader sisend = new BufferedReader 
                      (new FileReader (f));
         while ((rida = sisend.readLine()) != null) {
            if (r >= m)
               throw new IOException ("Ridade arv suurem kui " 
                  + String.valueOf (m));
            StringTokenizer st = new StringTokenizer (rida);
            int v = st.countTokens();
            ajutine[r] = new double [v];
            for (int j=0; j<v; j++) {
               ajutine[r][j] = Double.parseDouble (st.nextToken());
            }
            r++;
         }
         sisend.close();
      }
      catch (NumberFormatException e) {
         System.out.println ("Faili " + f + " rida nr. " + String.valueOf (r+1)
            + " sisaldab mitte reaalarvu:\n" + rida + "\n" + e);
      }
      catch (IOException e) {
         System.out.println ("S/V viga: " + e);
      }
      double[][] res = new double [r][];
      for (int i=0; i<res.length; i++) {
         res [i] = ajutine [i];
      }
      return res;
   } // loemassiiv

   /* d - kirjutatav massiiv, f - tulemusfaili nimi */
   public static void kirjutamassiiv (double[][] d, String f) {
      try {
         PrintWriter valjund = new PrintWriter 
                   (new FileWriter (f), true);
         for (int i=0; i<d.length; i++) {
            for (int j=0; j<d[i].length; j++) {
               valjund.print (String.valueOf (d[i][j]) + " ");
            }
            valjund.println();
         }
         valjund.close();
      }
      catch (IOException e) {
         System.out.println ("S/V viga: " + e);
      }
      return;
   } // kirjutamassiiv

} // other.Fail_massiiv

