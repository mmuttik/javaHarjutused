package other;

public class Ruutjuur1 {

   public static void main (String[] param) {
      double d = 0.;
      TextIO.putln ("Ruutjuure leidmine.");
 
      do {
         TextIO.put ("Sisesta positiivne arv ");
         d = TextIO.getlnDouble();
      } while (d <= 0.);

      TextIO.putln ("sqrt (" + String.valueOf (d) + ") = "
        + String.valueOf (Math.sqrt (d)));
   } // main

} // other.Ruutjuur1

