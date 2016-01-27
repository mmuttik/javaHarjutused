package jpoial;

/** N2ited maatriksitega imperatiivses stiilis. */
public class Maatr {
   
   /** Peameetod silumiseks. */
   public static void main (String[] s) {
      int[][] a = new int[][]{ {5, 2, 4}, {0, 1, 5}, {1, 0, 1} };
      System.out.println ("jpoial.Maatriks A: " + soneKuju (a));
      int[][] b = new int[][]{ {2, 8, 0}, {5, 3, 1}, {7, 4, 6} };
      System.out.println ("jpoial.Maatriks B: " + soneKuju (b));
      int[][] c = summa (a, b);
      System.out.println ("A + B: " + soneKuju (c));
      int[][] d = korrutis (a, b);
      System.out.println ("A * B: " + soneKuju (d));
      System.out.println ("B minReaMax on: " + minReaMax (b));
      System.out.println ("B maxReaMin on: " + maxReaMin (b));
      System.out.println ("B minVeeruMax on: " + minVeeruMax (b));
      System.out.println ("B maxVeeruMin on: " + maxVeeruMin (b));
      if (minReaMax (a) == maxVeeruMin (a))
         System.out.println ("A alumine sadulpunkt on: " + minReaMax (a));
      else
         System.out.println ("A-l ei ole alumist sadulpunkti");
      if (maxReaMin (a) == minVeeruMax (a))
         System.out.println ("A ylemine sadulpunkt on: " + maxReaMin (a));
      else
         System.out.println ("A-l ei ole ylemist sadulpunkti");
   } // main

   /** Teisendus s6neks. */
   public static String soneKuju (int[][] m) {
      String nl = System.getProperty ("line.separator");
      StringBuffer sb = new StringBuffer(nl);
      for (int i=0; i<m.length; i++) {
         for (int j=0; j<m[i].length; j++) {
            sb.append (String.valueOf (m[i][j]));
            sb.append ("\t");
         }
         sb.append (nl);
      }
      return sb.toString();
   } // soneKuju

   /** Maatriksite liitmine. */
   public static int[][] summa (int[][] m1, int[][] m2) {
      if (m1.length != m2.length)
         throw new RuntimeException ("ei saa liita");
      int[][] res = new int [m1.length][];
      for (int i=0; i<m1.length; i++) {
         if (m1[i].length != m2[i].length)
            throw new RuntimeException ("ei saa liita");
         res[i] = new int [m1[i].length];
         for (int j=0; j<m1[i].length; j++) {
            res[i][j] = m1[i][j] + m2[i][j];
         }
      }
      return res;
   } // summa

   /** Maatriksite korrutamine. */
   public static int[][] korrutis (int[][] m1, int[][] m2) {
      int m = m1.length;
      int p = m1[0].length;
      int n = m2[0].length;
      if (p != m2.length)
         throw new RuntimeException ("Ei saa korrutada");
      int[][] res = new int[m][n];
      for (int i=0; i<m; i++) {
         for (int j=0; j<n; j++) {
            res[i][j] = 0;
            for (int k=0; k<p; k++) {
               res[i][j] += m1[i][k]*m2[k][j];
            }
         }
      }
      return res;
   } // korrutis

   /** Maksimaalne element ridade miinimumide hulgas. */
   public static int maxReaMin (int[][] m) {
      int result = Integer.MIN_VALUE;  // l6pptulemuse algv22rtus
      // Tsykkel yle ridade
      for (int i=0; i<m.length; i++) {
         int rMin = Integer.MAX_VALUE; // jooksva rea miinimum
         for (int j=0; j<m[i].length; j++) {
            if (rMin > m[i][j]) rMin = m[i][j];
         } // for j
         if (result < rMin) result = rMin;
      } // for i
      return result;
   } // maxReaMin

   /** Minimaalne element ridade maksimumide hulgas. */
   public static int minReaMax (int[][] m) {
      int result = Integer.MAX_VALUE;  // l6pptulemuse algv22rtus
      // Tsykkel yle ridade
      for (int i=0; i<m.length; i++) {
         int rMax = Integer.MIN_VALUE; // jooksva rea maksimum
         for (int j=0; j<m[i].length; j++) {
            if (rMax < m[i][j]) rMax = m[i][j];
         } // for j
         if (result > rMax) result = rMax;
      } // for i
      return result;
   } // minReaMax

   /** Maksimaalne element veergude miinimumide hulgas. */
   public static int maxVeeruMin (int[][] m) {
      int result = Integer.MIN_VALUE;  // l6pptulemuse algv22rtus
      // Tsykkel yle veergude
      for (int j=0; j<m[0].length; j++) {
         int vMin = Integer.MAX_VALUE; // jooksva veeru miinimum
         for (int i=0; i<m.length; i++) {
            if (vMin > m[i][j]) vMin = m[i][j];
         } // for i
         if (result < vMin) result = vMin;
      } // for j
      return result;
   } // maxVeeruMin
                                                                                
   /** Minimaalne element veergude maksimumide hulgas. 
    *  Lubatud erineva pikkusega read.
    */
   public static int minVeeruMax (int[][] m) {
      int result = Integer.MAX_VALUE;  // l6pptulemuse algv22rtus
      // teeme kindlaks maksimaalse reapikkuse vArv
      int vArv = 0;
      for (int i=0; i<m.length; i++) {
         if (vArv < m[i].length) vArv = m[i].length;
      }
      // hoiame veergude maksimume massiivis vMax
      int[] vMax = new int [vArv];
      for (int j=0; j<vArv; j++) vMax[j]=Integer.MIN_VALUE;
      // arvutame maksimumid
      for (int i=0; i<m.length; i++) {
         for (int j=0; j<m[i].length; j++) {
            if (vMax[j] < m[i][j]) vMax[j] = m[i][j];
         }
      }
      // leiame minimaalse
      for (int j=0; j<vArv; j++) {
         if (vMax[j] < result) result = vMax[j];
      } // for j
      return result;
   } // minVeeruMax
    
} // jpoial.Maatr

