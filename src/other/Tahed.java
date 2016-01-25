package other;

import java.util.*;

public class Tahed {

   public static void main (String[] args) {
      String s = args[0];
      String t = asenda (s);
      System.out.println (s);
      System.out.println (t);
   }

   public static String asenda (String s) {
      StringBuffer tulem = new StringBuffer();
      for (int i=0; i < s.length(); i++) {
         char c = s.charAt(i);
         if (Character.isLowerCase(c)) {
            tulem.append(".");
         } else {
            tulem.append(c);
         }
      }
      return tulem.toString();
   }
}

