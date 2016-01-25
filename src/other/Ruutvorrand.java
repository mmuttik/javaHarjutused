package other;

public class Ruutvorrand {

  // Klass other.TextIO.class   D.Eck'i 6pikust peab olema jooksvas kataloogis!

   public static void main (String[] param) {

     // andmete sisestus
      TextIO.putln ("Ruutv6rrandi lahendamine. Sisesta kordajad:");
      TextIO.put ("a = ");
      double a = TextIO.getlnDouble();
      TextIO.put ("b = ");
      double b = TextIO.getlnDouble();
      TextIO.put ("c = ");
      double c = TextIO.getlnDouble();

     // tulemuse leidmine
      if (Math.abs (a) < 0.000000000001)  // a == 0.
         throw new RuntimeException ("\nTegemist pole ruutv6rrandiga, a==0.");
      double d = b*b - 4.*a*c;
      if (d < 0.)
         throw new RuntimeException ("\nReaallahendid puuduvad!");
      double x1 = (-b + Math.sqrt (d)) / (2.*a);
      double x2 = (-b - Math.sqrt (d)) / (2.*a);

     // tulemuste v2ljastamine
      TextIO.putln ("x1 = " + x1);
      TextIO.putln ("x2 = " + x2);
         
   } // main

} // other.Ruutvorrand

