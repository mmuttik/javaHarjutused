package jpoial;

import java.util.*;

/** Leida etteantud s6nade esinemissagedused tekstis.
 * @author Jaanus Poial
 * @version 0.2
 */
public class Sagedused {

   /** peameetod silumiseks, tekst anda k2surealt */
   public static void main (String[] arg) {
      
      // p66rdumine sagedustabeli moodustaja poole
      HashMap stabel = leiaSagedused (arg);

      // v6tmed t2hestiku j2rjekorda
      Object [] om = stabel.keySet().toArray();
      Arrays.sort (om);

      // paaride v2ljastamine
      for (int i=0; i<om.length; i++) {
         String sona = (String)om[i];
         int sagedus = ((Integer)stabel.get (sona)).intValue();
         System.out.println (sona + " " + String.valueOf (sagedus));
      }

   } // main

   /** sagedustabeli moodustamine.
    * @param t tekst s6nede massiivi kujul
    * @return sagedustabel, milles on paarid "String-Integer"
    */
   public static HashMap leiaSagedused (String[] t) {
      HashMap result = new HashMap();
      for (int i=0; i<t.length; i++) {
         StringTokenizer st = new StringTokenizer (t [i]);
         while (st.hasMoreTokens()) {
            String word = st.nextToken();
            if (result.containsKey (word)) {
               int k = ((Integer)result.get (word)).intValue();
               result.put (word, new Integer (k+1));
            } else {
               result.put (word, new Integer (1));
            }
         }
      }
      return result;
   } // leiaSagedused

} // jpoial.Sagedused

