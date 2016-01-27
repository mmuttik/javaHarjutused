package jpoial;// file: jpoial.Collexample5.java

import java.util.*;

/**
 * Using ArrayList and HashMap.
 * @author Jaanus Poial
 * @version 0.6
 * @since 1.5
 */
public class Collexample5 {

   /**
    * Main method.
    * @param parameters command line parameters.
    */
   public static void main (String[] parameters) {

      final int SIZE = 100;
      ArrayList <Integer> randomNumbers = new ArrayList <Integer> (SIZE);
      Random generator = new Random();
      for (int i=0; i < SIZE; i++) {
         randomNumbers.add (new Integer (generator.nextInt(1000)));
      }
      System.out.println (maximum (randomNumbers));

      HashMap <String, String> courses = new HashMap <String, String>();
      courses.put ("I200", "Java");
      courses.put ("I209", "Algorithms");
      courses.put ("K402", "Programming II");
      courses.put ("K022", "Applications: Internet");

      Iterator <String> codes = courses.keySet().iterator();
      while (codes.hasNext()) {
         System.out.println (codes.next());
      }

      String course = courses.remove ("K022");
      System.out.println (course);

      codes = courses.keySet().iterator();
      String code;
      while (codes.hasNext()) {
         code = codes.next();
         System.out.println (code + " " + courses.get (code));
      }

      System.out.println (randomNumbers);
      Integer tmp;
      for (int i=0; i < randomNumbers.size()/2; i++) {
         tmp = randomNumbers.get (i);
         randomNumbers.set (i, randomNumbers.get (randomNumbers.size()-i-1));
         randomNumbers.set (randomNumbers.size()-i-1, tmp);
      }
      System.out.println (randomNumbers);

      System.out.println (maximum2 (randomNumbers));

   } // main

   /**
    * Finding a maximal element of a list.
    * @param a list
    * (satisfies interface java.util.List, 
    * elements satisfy interface Comparable).
    * @return maximal element.
    * @throws IndexOutOfBoundsException if the list is empty.
    */
   static public <T extends Object & Comparable <? super T>> T 
                              maximum (List <? extends T> a) {
      T maxelem;
      if (a == null)
         throw new IndexOutOfBoundsException (" maximum got a null list");
      if (a.size() < 1)
         throw new IndexOutOfBoundsException (" maximum got an empty list");
      maxelem = a.get (0);
      for (int i=0; i < a.size(); i++) {
         if (maxelem.compareTo (a.get (i)) < 0)
            maxelem = a.get (i);
      }
      return maxelem;
   } // maximum

   /**
    * Finding a maximal element of a collection.
    * @param a Collection, elements satisfy interface Comparable.
    * @return maximal element.
    * @throws NoSuchElementException if <code> a </code> is empty.
    */
   static public <T extends Object & Comparable <? super T>> T 
                       maximum2 (Collection <? extends T> a) {
      T maxelem;
      if (a == null)
         throw new IndexOutOfBoundsException (" maximum2 got a null collection");
      Iterator < ? extends T > iter = a.iterator();
      if (iter.hasNext())
              maxelem = iter.next();
         else throw new NoSuchElementException (" maximum2 got an empty collection");
      for (T c : a) {
         if (maxelem.compareTo (c) < 0)
            maxelem = c;
      }
      return maxelem;
   } // maximum2

} // jpoial.Collexample5

