package other;

public class Skalaar {

   public static void main (String[] aaa) {
      int [][] a = new int[][] {{1, 2, 3}, {-1, 4, 0}};
      int [][] b = new int[][] {{5, 0, 3}, {-1, 4, 9}};
      System.out.println ( Skalaar.skalaarKorrutis (a, b));
      System.out.println (skalaarKorrutis (new int[][]{{3, 5}, {2 ,4}},
                            new int[][]{{0, 4}, {5, 1}}));
   } // main

   public static int skalaarKorrutis (int[][] x, int[][] y) {
      if (x==null || y==null)
         return 0;
      int result = 0;
      for (int i=0; i<x.length; i++)  {
         for (int j=0; j<x[0].length; j++) {
            result += x[i][j] * y[i][j];
         }
      }
      return result;
   } // skalaarKorrutis

} // other.Skalaar

