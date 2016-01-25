package other;

public class P {

   public static void main (String[] argum) {
      joonista (5);
   } // main

   public static void joonista (int n) {
      for (int i=0; i<n; i++) {
         for (int j=0; j<(n-i); j++) {
            System.out.print (" ");
         }
         for (int p=0; p<i; p++) {
            System.out.print (" *");
         }
         System.out.println();
      }
      for (int k=n-2; k>=0; k--) {
         for (int q=0; q<(n-k); q++) {
            System.out.print (" ");
         }
         for (int p=0; p<k; p++) {
            System.out.print (" *");
         }
         System.out.println();
      }
   } // joonista

} // other.P

