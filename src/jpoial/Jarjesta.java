package jpoial;

import java.util.*;

public class Jarjesta {

   public static void main (String[] args) {
      String[] tulem = jarjesta (args);
      for (int i=0; i < args.length; i++)
         System.out.print (args[i] + " ");
      System.out.println();
      for (int i=0; i < tulem.length; i++) 
         System.out.print (tulem[i] + " ");
      System.out.println();
   } // main

   public static String[] jarjesta (String[] m) {
      String[] res = new String [m.length];
      for (int i=0; i < m.length; i++)
         res[i] = m[i];
      Arrays.sort (res);
      return res;
   } // jarjesta

} // jpoial.Jarjesta

