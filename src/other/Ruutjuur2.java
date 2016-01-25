package other;

public class Ruutjuur2 {

   public static void main (String[] param) {
      double d = 0.;
      TextIO.putln ("Ruutjuure leidmine.");
      TextIO.put ("Sisesta positiivne arv: ");

      while (true) {
         d = TextIO.getlnDouble();
         if (d <= 0.) {
            TextIO.put ("Ei sobi. Uuesti: ");
            continue;
         }
         break;
      }

      TextIO.putln ("sqrt (" + String.valueOf (d) + ") = "
        + String.valueOf (Math.sqrt (d)));
   } // main

} // other.Ruutjuur2

