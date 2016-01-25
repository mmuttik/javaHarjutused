package other;

public class Keskmine {

   public static void main (String [] s) {
      double [] hinded = new double [100];
      double hinne = 0.;
      int k = 0;
      do {
         System.out.print ("other.Hinne: ");
         hinne = TextIO.getlnDouble();
         hinded [k] = hinne;
         k++;
      } while (Math.abs (hinne) > 0.000000001);
      double[] h1 = new double [k-1];
      for (int i=0; i<k-1; i++)
         h1[i]=hinded[i];
      double keskmine = Keskmine.leiaKeskmine (h1);
      for (int i=0; i<hinded.length; i++) 
         System.out.print (String.valueOf (hinded[i]) + "  ");
      System.out.println();
      System.out.println ("\nother.Keskmine on: " + keskmine);
   } // main

   public static double leiaKeskmine (double[] m) {
      double result=0.;
      if (m.length > 0) {
         for (int i=0; i<m.length; i++) {
            result += m[i];
         } // for
         result /= m.length;
      } // if
      return result;
   } // leiaKeskmine

} // other.Keskmine

