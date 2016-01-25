package other;

public class Fact {

   public static void main (String[] args) {
      System.out.println (fact (6));
   } // main

   public static long fact (int n) {
      if (n < 2)
         return 1;
      else
         return n * fact (n-1);
   } // fact

} // other.Fact

