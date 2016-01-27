package jpoial;

/** Avaldiste katsetused. */
public class Katsed {

   public static void main (String[] argumendid) {
      System.out.println ("1 & 1 == " + String.valueOf (1 & 1));
      System.out.println ("1 & 2 == " + String.valueOf (1 & 2));
      System.out.println ("0 | 2 == " + String.valueOf (0 | 2));
      System.out.println ("-1 >>> 30 == " + String.valueOf (-1 >>> 30));
      System.out.println ("-1 >> 30 == " + String.valueOf (-1 >> 30));
      System.out.println ("1 << 30 == " + String.valueOf (1 << 30));
      System.out.println ("1 << 31 == " + String.valueOf (1 << 31));
      System.out.println ("~3 == " + String.valueOf (~3));
   } // main

} // jpoial.Katsed

