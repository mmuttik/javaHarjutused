package jpoial;

public class Erindi_kasutamine {

   public static void main (String[] args) {
      int n = 0;
      try {
         n = Integer.parseInt (args[0]);
      } catch (Exception e) {
         // n j22b nulliks
      }
      if (n<1 || n>99)
         throw new IllegalArgumentException
            ("\nK2sureal peab olema t2isarv vahemikust 1 kuni 99");
      System.out.println("K2surealt saadi arv " + String.valueOf (n));
   } // main

} // jpoial.Erindi_kasutamine

