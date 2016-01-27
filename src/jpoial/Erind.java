package jpoial;

import java.io.*;

public class Erind {

   public static void main (String[] args) {
      int n = 0;
      int m = 0;
      while (true) {
         try {
            BufferedReader sisse = new BufferedReader
                      (new InputStreamReader (System.in));
            System.out.println ("V2ljumiseks vajutage ctrl-C");
            System.out.print ("Laste arv: ");
            String s = sisse.readLine();
            n = Integer.parseInt (s);
            if (n<0)
               throw new IllegalArgumentException (String.valueOf (n));
            System.out.print ("6unte arv: ");
            s = sisse.readLine();
            m = Integer.parseInt (s);
            if (m<0)
               throw new IllegalArgumentException (String.valueOf (m));
            System.out.println ("Igale lapsele " 
                      + String.valueOf (m/n) + " 6una ja "
                      + String.valueOf (m%n) + " j22b yle");
         }
         catch (NumberFormatException e) {
            System.out.println ("Ei ole arv: " + e.toString() );
         }
         catch (ArithmeticException e) {
            System.out.println ("Aritmeetikakatkestus: " + e.toString());
         }
         catch (Exception muu) {
            System.out.println ("Probleem: " + muu.toString());
         }
         finally {
            System.out.println ("n = " + n + "  m = " + m);
         }
      }
   } // main

} // jpoial.Erind

