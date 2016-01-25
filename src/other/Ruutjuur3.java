package other;

public class Ruutjuur3 {

   public static void main (String[] param) {
      double d = 0.;
      TextIO.putln ("Ruutjuure leidmine.");
      TextIO.put ("Sisesta positiivne arv: ");

      while (true) {
         d = TextIO.getlnDouble();
         if (d > 0.) break;
         TextIO.put ("Ei sobi. Uuesti: ");
      }

      TextIO.putln ("sqrt (" + String.valueOf (d) + ") = "
        + String.valueOf (Math.sqrt (d)));
   } // main

} // other.Ruutjuur3

