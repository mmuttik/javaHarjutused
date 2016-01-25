package other;

import java.util.*;

/**
 * ArrayList ja paisktabeli kasutamine.
 * @author Jaanus Poial
 * @version 0.3
 * @since JDK 1.2
 */

public class Kogumid {

   /**
    * Peameetod.
    * @param parameetrid k2surea parameetrid.
    */

   public static void main (String[] parameetrid) {

      final int SUURUS = 100;
      ArrayList juhuarvud = new ArrayList (SUURUS);
      Random generaator = new Random();
      for (int i=0; i<SUURUS; i++) {
         juhuarvud.add (new Integer (generaator.nextInt(1000)));
      }
      System.out.println (maksimum (juhuarvud));

      HashMap ained = new HashMap();
      ained.put ("I200", "Java");
      ained.put ("I209", "Algoritmid");
      ained.put ("MTAT.03.001", "Programmeerimine II");
      ained.put ("MTAT.03.022", "Rakendustarkvara: Internet");

      Iterator koodid = ained.keySet().iterator();
      while (koodid.hasNext()) {
         System.out.println (koodid.next());
      }

      String aine = (String)ained.remove ("MTAT.03.022");
      System.out.println (aine);

      koodid = ained.keySet().iterator();
      String kood;
      while (koodid.hasNext()) {
         kood = (String)koodid.next();
         System.out.println (kood + " " + (String)ained.get (kood));
      }

      System.out.println (juhuarvud);
      Object tmp;
      for (int i=0; i<juhuarvud.size()/2; i++) {
         tmp = juhuarvud.get (i);
         juhuarvud.set (i, juhuarvud.get (juhuarvud.size()-i-1));
         juhuarvud.set (juhuarvud.size()-i-1, tmp);
      }
      System.out.println (juhuarvud);

      System.out.println (maksimum2 (juhuarvud));

   } // main lopp

   /**
    * Maksimaalse elemendi leidmine j�rjendist.
    * @param a j�rjend
    * (rahuldab liidest java.util.List, 
    * elemendid rahuldavad liidest java.lang.Comparable).
    * @return j�rjendi maksimaalne element.
    * @throws IndexOutOfBoundsException kui j�rjend on t�hi.
    */

   static public Comparable maksimum (List a) {
      Comparable maks;
      if (a.size() < 1)
         throw new IndexOutOfBoundsException (" maksimumi leidmisel");
      maks = (Comparable)a.get (0);
      for (int i=0; i<a.size(); i++) {
         if (maks.compareTo ((Comparable)a.get (i)) < 0)
            maks = (Comparable)a.get (i);
      }
      return maks;
   } // maksimum lopp

   /**
    * Maksimaalse elemendi leidmine.
    * @param a Collection, mille
    * elemendid rahuldavad liidest Comparable.
    * @return maksimaalne element.
    * @throws NoSuchElementException kui <code> a </code> on t�hi.
    */

   static public Comparable maksimum2 (Collection a) {
      Comparable maks;
      Iterator iteraator = a.iterator();
      if (iteraator.hasNext())
              maks = (Comparable)iteraator.next();
         else throw new NoSuchElementException (" maksimumi leidmisel");
      Comparable c;
      while (iteraator.hasNext()) {
         c = (Comparable)iteraator.next();
         if (maks.compareTo (c)<0)
            maks = c;
      }
      return maks;
   } // maksimum2 lopp

} // other.Kogumid lopp

//=============================================================
// faili l6pp
//=============================================================

