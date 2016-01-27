package jpoial;// <pre>

// fail: jpoial.LoeMaatriks.java

import java.io.*;
import java.util.*;

/**
 * Reaalarvumaatriksi lugemine failist.
 * @author Jaanus Poial
 * @version 0.1
 */
public class LoeMaatriks {

   /** Peameetod silumiseks.
    * @param arg faili nimi
    */
   public static void main (String[] arg) {

      // sisendfaili nime m22ramine
      String fNimi = "maatriks.txt";
      if (arg.length>0)
         fNimi = arg [0];

      // p66rdumine lugemise meetodi poole
      double[][] d = loeFailist (fNimi);

      // kontrolliks v2ljastame tulemuse konsoolile
      System.out.println ("Loeti maatriks: ");
      for (int i=0; i<d.length; i++) {
         for (int j=0; j<d[i].length; j++) {
            System.out.print ("\t" + String.valueOf (d[i][j]));
         }
         System.out.println();
      }
   } // main

   /**
    * Reaalarvumaatriksi v22rtustamine tekstifailist. Faili esimene rida
    * on maatriksi ridade arv, teine rida on maatriksi veergude arv ja
    * edasi on ridade kaupa maatriksi elemendid - yks tekstirida iga maatriksi
    * rea kohta. Elementide vahel on tyhikud.
    * @param failiNimi tekstifaili nimi, millest loetakse
    * @return v22rtustatud reaalarvumaatriks
    */
   public static double[][] loeFailist (String failiNimi) {
      double[][] tulemus = null; // m2lu eraldame hiljem
      try {
         // Avada fail (faili nime saame parameetrina)
         BufferedReader sisend = 
            new BufferedReader (new FileReader (failiNimi));

         // T66ks vajalikud muutujad
         String rida;         // failist yhe tekstirea lugemiseks
         int m = 0;           // ridade arv
         int n = 0;           // veergude arv
         StringTokenizer st;  // tekstirea hakkimiseks

         // Lugeda maatriksi m66tmed
         if ((rida=sisend.readLine()) != null) {
            m = Integer.parseInt (rida);
         } else 
            throw new EOFException ("puudub ridade arv");
         if ((rida=sisend.readLine()) != null) {
            n = Integer.parseInt (rida);
         } else 
            throw new EOFException ("puudub veergude arv");

         // Eraldada m2lu
         tulemus = new double [m][n];

         // Lugeda maatriksi read
         for (int i=0; i<m; i++) {
            if ((rida=sisend.readLine()) != null) {
               st = new StringTokenizer (rida);
            } else 
               throw new EOFException ("liiga v2he elemente");
            for (int j=0; j<n; j++) {
               tulemus [i][j] = Double.parseDouble (st.nextToken());
            }
         }

         // Sulgeda fail
         sisend.close();
      }
      catch (IOException e) {
         System.out.println ("S/V viga: " + e);
      }
      
      // Tagastada tulemus
      return tulemus;
   } // loeFailist

} // jpoial.LoeMaatriks

// faili l6pp

// </pre>

