package jpoial;

import java.util.*;

public class Pikkused {

   public static void main (String[] args) {
      String p = Pikkused.pikim (args);
      System.out.println ("Pikim s6na on " + p);
   } // main

   public static String pikim (String[] m) {
      int p = 0; // pikima s6na pikkus, esialgu 0
      String res = "";
      for (int i=0; i < m.length; i++) {
         StringTokenizer st = new StringTokenizer (m[i]);
         while (st.hasMoreTokens()) {
            String sona = st.nextToken();
            if (sona.length() > p) {
               res = sona;
               p = sona.length();
            }
         } // while
      } // for
      return res;
   } // pikim

} // jpoial.Pikkused

