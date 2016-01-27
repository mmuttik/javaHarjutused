package jpoial;// -----------------------------------------------------
// jpoial.Kellad.java
// -----------------------------------------------------

public class Kellad {
   public static void main (String[] s) {
      Kell k = new KaeKell ("Rolex");
      System.out.println (((KaeKell)k).mark 
         + " " + k.jooksevAeg());
      Mobla m = new Mobla (25612345);
      System.out.println (String.valueOf (m.number)
         + " " + m.jooksevAeg());
   }
}

interface Ajanaitaja {
   String jooksevAeg();
}

class Kell implements Ajanaitaja {
   public String jooksevAeg() {
      return new java.util.Date().toString();
   }
}

class KaeKell extends Kell {
   String mark;
   KaeKell (String s) {
      mark = s;
   }
}

class Telefon {
   int number;
   Telefon (int n) {
      number = n;
   }
}

class Mobla extends Telefon implements Ajanaitaja {
   Kell sisemineKell;
   Mobla (int n) {
      super (n);
      sisemineKell = new Kell();
   }
   public String jooksevAeg() {
      return sisemineKell.jooksevAeg();
   }
}

