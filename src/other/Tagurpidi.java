package other;

import java.util.*;

public class Tagurpidi {

   public static void main (String[] args) {
      String tekst = "";
      if (args.length > 0) {
         StringBuilder sb = new StringBuilder();
         for (String sona: args) {
            sb.append (sona);
            sb.append (" ");
         }
         tekst = sb.toString();
      } else {
         tekst = "aias sadas saia aga leiba mitte";
      }
      System.out.println (tekst);
      System.out.println (tagurpidi (tekst));
   }

   public static String tagurpidi (String s) {
      StringBuilder sb = new StringBuilder();
      StringTokenizer stk = new StringTokenizer (s);
      while (stk.hasMoreTokens()) {
         String w = stk.nextToken();
         sb.append (new StringBuilder(w).reverse());
         sb.append (" ");
      }
      return sb.toString();
   }

}

