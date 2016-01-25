package other;

public class Preili implements Ujuja {

   Hobune suksu = new Hobune();

   public void ujub() {
      suksu.ujub();
   }

   public static void main (String[] s) {
      Preili agnes = new Preili();
      agnes.ujub();
   }

} // other.Preili l6pp

class Hobune implements Ujuja {

   public void ujub() {
      System.out.println ("Ma oskan ujuda!");
   }

} // other.Hobune l6pp

interface Ujuja {
   public void ujub();
}

