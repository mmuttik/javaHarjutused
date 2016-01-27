package jpoial;

import java.util.*;

public class Calc {

   public static void main (String[] args) {
      StringTokenizer st = new StringTokenizer (args[0], "+-*/", true);
      int arv1 = 0;
      int arv2 = 0;
      char tehe = ' ';
      int tulem = 0;
      if (st.hasMoreTokens())
         arv1 = Integer.parseInt (st.nextToken());
      if (st.hasMoreTokens())
         tehe = ((String)st.nextToken()).charAt(0);
      if (st.hasMoreTokens())
         arv2 = Integer.parseInt (st.nextToken());
      switch (tehe) {
         case '+': { tulem = arv1 + arv2; break; }
         case '-': { tulem = arv1 - arv2; break; }
         case '*': { tulem = arv1 * arv2; break; }
         case '/': { tulem = arv1 / arv2; break; }
         default: throw new RuntimeException ("viga avaldises");
      }
      System.out.println (tulem);
   }
}

