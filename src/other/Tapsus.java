package other;

public class Tapsus {
   
      public static void main (String[] args) {
         double d1 = 0.123;
         double d2 = d1;
         d1 = Math.PI*d1*Math.E;
         d1 = d1 / (Math.E*Math.PI);
         System.out.println (d1 == d2);
      }
      
}