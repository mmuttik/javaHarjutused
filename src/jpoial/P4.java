package jpoial;

public class P4 {

   public static void main (String[] param) {
      System.out.println ("16-systeemi korratabel");
      for (int i=1; i<0x10; i++) {
         for (int j=1; j<0x10; j++) {
            if (i*j < 0x10) System.out.print (" "); // format
            System.out.print (Integer.toHexString (i*j) + " ");
         } // for j
         System.out.println();
      } // for i
   } // main

} // jpoial.P4
