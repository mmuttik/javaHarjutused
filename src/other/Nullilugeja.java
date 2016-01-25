package other;

public class Nullilugeja {

   public static final double EPSILON = 0.000001;

   public static void main (String [] aaaaa) {
      double [] m = new double [] { 1.5, 0.00001, -0.00001, -3};
      int nArv = countZeros (m);
      System.out.println ("Nullilahedasi elemente oli: " 
         + String.valueOf (nArv));
   } // main

   public static int countZeros (double[] d) {
      int res = 0;
      for (int i=0; i<d.length; i++) {
         if (d[i] < EPSILON && d[i] > -EPSILON)
            res++;
      } // for
      return res;
   } // countZeros

} // other.Nullilugeja

