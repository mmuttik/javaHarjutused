package other;

public class Jada {

   public static void main (String[] args) {
      int [] res;
      res = moodusta (args);
      for (int i=0; i < res.length; i++)
         System.out.println (res[i]);
   }

   public static int[] moodusta (String[] s) {
      int[] t = new int [s.length];
      for (int i=0; i < t.length; i++) {
         int k = Integer.parseInt (s[i]);
         t[i] = k;
      }
      return t;
   }

}

