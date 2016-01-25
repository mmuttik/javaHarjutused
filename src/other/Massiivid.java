package other;

/** N2iteylesanded j2rjendi t66tlemise kohta. */
public class Massiivid {

   /** Peameetod silumiseks. */
   public static void main (String[] krp) {

      // massiivialgati
      int [] a = { 3, -8, 2, 0, -1, 9, -150};
      for (int i=0; i<a.length; i++)
         System.out.print (String.valueOf (a[i]) + " ");
      System.out.println();

      System.out.println ("Suurim element: " + String.valueOf (maks (a)));
      System.out.println ("M2rgimuutude arv: " + String.valueOf (mmArv (a)));
      System.out.println ("Ymber p66ratult:");
      int [] p = reverse (a);
      for (int i=0; i<p.length; i++)
         System.out.print (String.valueOf (p[i]) + " ");
      System.out.println();

   } // main

   /** Maksimaalse elemendi v22rtuse leidmine. */
   public static int maks (int[] m) {
      int res = Integer.MIN_VALUE;
      for (int i=0; i<m.length; i++) {
         if (m[i] > res)
            res = m[i];
      } // for i
      return res;
   } // maks

   /** M2rgimuutude arvu leidmine. */
   public static int mmArv (int [] m) {
      int res = 0;
      if (m.length < 2) return 0;
      for (int i=0; i<m.length-1; i++) {
         if (m[i]>=0 && m[i+1]<0) res++;
         if (m[i]<0 && m[i+1]>=0) res++;
      }
      return res;
   } // mmArv

   /** Vastupidise elementide j2rjekorraga massiivi leidmine. */
   public static int [] reverse (int [] m) {
      int[] res = new int [m.length];
      for (int i=0; i<m.length; i++) {
         res [res.length - 1 - i] = m [i];
      }
      return res;
   } // reverse

} // other.Massiivid

