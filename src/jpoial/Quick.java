package jpoial;

import java.util.*;

public class Quick {

   public static final int MAX = 16;
   public static int vahetusi = 0;

   static public void main (String[] arg) {
      List<Integer> list = new ArrayList<Integer> (MAX); // originaal
      Random generaator = new Random();
      list.clear();
      if (arg.length == 0) {
        for (int i = 0; i < MAX; i++) {
           list.add (new Integer (generaator.nextInt (10)));
        }
      } else {
        for (int i=0; i < arg.length; i++) {
           list.add (new Integer (arg[i]));
        }
      }
      System.out.println (list);
      vahetusi = 0;
      qsort (list, 0, list.size());
      if (!checkOrder (list, 0, list.size()))
            throw new RuntimeException ("Ei j2rjesta 6igesti!!!");
      System.out.println (list);
      System.out.println ("Vahetusi: " + vahetusi);
   }

   /**
    * Sorteerida List kiirmeetodil.
    * @param massiiv sorteeritav list
    * @param l sorteeritava l&otilde;igu algusindeks (kaasa arvatud)
    * @param r sorteeritava l&otilde;igu l&otilde;ppindeks (v&auml;lja arvatud)
    */
   static public <T extends Object & Comparable<? super T>> void 
    qsort (List<T> massiiv, int l, int r) {
      if (massiiv.size() < 2) return;
      if ((r-l)<2) return;
      int i = l; int j = r-1;
      T x = massiiv.get ((i+j) / 2);
      do {
         while (massiiv.get (i).compareTo (x) < 0) i++;
         while (x.compareTo (massiiv.get (j)) < 0) j--;
         if (i <= j) {
            T tmp = massiiv.get (i);
            vahetusi++;
            massiiv.set (i, massiiv.get (j));
            massiiv.set (j, tmp);
            System.out.println ("L6ik "+l+".."+r+", keskm " + x +": "+i+"<>"+j+
               ": "+ massiiv.get(j) + " ja "+massiiv.get(i));
            i++; j--;
         }
      } while (i < j);
      if (l < j) qsort (massiiv, l, j+1); // rekursioon
      if (i < r-1) qsort (massiiv, i, r); // rekursioon
   } // qsort() lopp

   /**
    * Kas on j2rjestatud List, mille elemendid realiseerivad
    * liidest Comparable.
    * @param a sorteeritud list.
    * @param l vasak indeks (k.a.)
    * @param r parem indeks (v.a.)
    * @return kas on j2rjestatud
    */
   static <T extends Object & Comparable<? super T>> boolean
    checkOrder (List<T> a, int l, int r) {
      if (a==null)
         throw new IllegalArgumentException();
      if (a.size() < 2) 
         return true;
      if (l<0 || r>a.size() || l>=r)
         throw new IllegalArgumentException();
      if (r-l < 2)
         return true;
      for (int i=l; i<r-1; i++) {
         if (a.get (i).compareTo (a.get (i+1)) > 0)
            return false;
      } // for
      return true;
   } // checkOrder() lopp

}

