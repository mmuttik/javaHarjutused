package other;

import java.util.*;

public class Control {

   public static void main (String[] args) {

      // if statement
      if (args.length > 0)
         System.out.println ("There are command line parameters");

      // for statement over array
      for (String s: args)
         System.out.print (s + " ");

      System.out.println();
      double random = Math.random();
      String rstring = String.format ("%6.3f", random);

      // if-else statement
      if (random < 0.5)
         System.out.println (rstring + " < 0.5 ");
      else
         System.out.println (rstring + " >= 0.5 ");

      // for statement with loop index
      for (int i=0; i < 10; i++)
         System.out.println (String.format ("%5d %6d %7d", i, i*i, i*i*i));

      double x = 0.;
      Scanner inp = new Scanner (System.in);

      // while statement
      while (x <= 0.) {
         System.out.print ("Input a positive real number: ");
         x = inp.nextDouble();
      }

      System.out.println ("sqrt(" + x + ") = " + Math.sqrt (x));
      
      inp.close ();

      // do-while statement
      do {
         System.out.print ("Input a positive real number: ");
         x = inp.nextDouble();
      } while (x <= 0.);

      System.out.println ("sqrt(" + x + ") = " + Math.sqrt (x));

      // continue
      // count all q-system numbers that have p positions
      int p = 3; // number of positions
      int q = 4; // system base
      int[] t = new int [p];
      int n = 0;
      do {
         if (t[n]< q) {
            t[n]++;
            if (n < p-1) {
               n++;
               continue;
            } else {
               for (int i=0; i < p; i++)
                  System.out.print (t[i]-1);
               System.out.println();
            }
         } else {
            t[n] = 0;
            n--;
         }
      } while (n >= 0);

   }

}

