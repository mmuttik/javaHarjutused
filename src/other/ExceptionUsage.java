package other;// file: ExceptioUsage.java

/** A small example about catching NumberFormatException. 
 * @author Jaanus Poial
 * @version 0.3
 */
public class ExceptionUsage {

   /** Main method gets an integer parameter from the command line.
    * If the parameter is not a number or if it is not in between 1 and 99
    * an IllegalArgumentException is thrown.
    */
   public static void main (String[] args) {
      int n = 0;
      try {
         n = Integer.parseInt (args[0]);
      } catch (Exception e) {
         // n remains zero and a new exception is thrown
      }
      if (n<1 || n>99)
         throw new IllegalArgumentException
            ("\nCommand line parameter has to be a number in between 1 and 99 ");
      System.out.println("Parameter n = " + String.valueOf (n));
   } // main

} // other.ExceptionUsage

// end of file

