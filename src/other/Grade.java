package other;

public class Grade {

   public static void main (String[] p) {
      double percent;
      while (true) {
         System.out.print ("Sisesta protsent: ");
         percent = TextIO.getlnDouble();
         System.out.print (percent + ": ");
         System.out.println (grade (percent));
      } // while
   } // main


   /** Hinde arvutamine.
    * @param d protsent
    * @return hinne s6nades
    */
   public static String grade (double d) {
      String grade = "not defined";
      // TODO!!! Your program here!
      return grade;
   }

}

