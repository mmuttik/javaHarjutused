package other;

public class Kjag2 {

   public static void main (String[] aaa) {
      int a = -1;
      while ((a<=0)||(a%3 != 0)) {
         System.out.print ("Sisesta kolmega jaguv positiivne arv: ");
         a = TextIO.getlnInt();
      }
      System.out.println ("Sobiv arv oli: " + String.valueOf (a));
   } // main

} // other.Kjag2

