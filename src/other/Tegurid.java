package other;

public class Tegurid {

   public static void main (String[] param) {

     // sisestus
      if (param.length == 0)
         throw new RuntimeException ("Anna k2sureal t2isarv > 2 ");
      int n = Integer.parseInt (param [0]);

     // teguriteks lahutamine
      int tegur = 2;
      System.out.print ("1");
      while (n >= 2) {
         if (n%tegur == 0) {
            System.out.print (" x " + String.valueOf (tegur));
            n /= tegur;
         }
         else tegur++;
      }
      System.out.println();

   } // main

} // other.Tegurid

