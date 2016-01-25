package other;

public class NullideArv {

   public static void main (String [] aaa) {
      double [] m = {5., 0., -2., -0.000000000000001, 0.0000000000000000001};
      System.out.println (nArv (m));
   } // main

   public static int nArv (double [] d) {
      int result = 0;
      for (int i=0; i<d.length; i++) {
         if (Math.abs (d[i])<0.0000000001)
            result++;
      }
      return result;
   } // nArv

} // other.NullideArv

