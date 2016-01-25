package other;

public class Kuud {

   public static void main (String[] param) {

      if (param.length == 0)
         throw new RuntimeException ("Pane kuu number k2sureale");
      int kuu = Integer.parseInt (param [0]);

      System.out.print ("Veel tuleb oodata ");

      switch (kuu) {
         case 1:
            System.out.print ("jaanuar, ");
         case 2:
            System.out.print ("veebruar, ");
         case 3:
            System.out.print ("m2rts, ");
         case 4:
            System.out.print ("aprill, ");
         case 5:
            System.out.print ("mai, ");
         case 6:
            System.out.print ("juuni, ");
         case 7:
            System.out.print ("juuli, ");
         case 8:
            System.out.print ("august, ");
         case 9:
            System.out.print ("september, ");
         case 10:
            System.out.print ("oktoober, ");
         case 11:
            System.out.print ("november, ");
         case 12:
            System.out.print ("detsember ");
         default:
            System.out.println ("ja siis ongi aasta l6pp.");
      }

   } // main

} // other.Kuud

