package jpoial;

/**
 * Fail jpoial.Graafid.java
 * @author Jaanus Poial
 * @version 0.2 kevad 99
 */

//====================================================================
// Na"ide ahelatest ja graafist.        jpoial.Liides ja tuletatud klassid.
//--------------------------------------------------------------------
// jpoial.Graaf on kujutatud ku"lgnevusstruktuurina -- tippude ahel,
// mille igas tipus on sellest va"ljuvate kaarte ahel ja igas
// kaares on viit tipule, millesse see kaar suubub.
//====================================================================

class Graafid { // pohiprogramm, sisaldab ainult main

   static public void main (String[] argumendid) {
      System.out.println ("Tere");
      Graaf g = new Graaf ("minugraaf");
      Tipp t1 = new Tipp ("T1");
      Kaar k1 = new Kaar ("K1");
      g.lisaTipp (t1);
      Tipp t2 = new Tipp();
      t2.paneNimi ("T0");
      g.lisaTipp (t2);
      t1.lisaValjuvkaar (k1);
      k1.paneSuubuma (t2);
      System.out.println (g);      //oluline, et toString() meetod oleks!
      System.out.println ("Lopp");
   }

} // jpoial.Graafid lopp

//==========================================================
// jpoial.Liides graafi, tippude ja kaarte jaoks
//==========================================================

interface AbstrGraaf {
   boolean   lisaTipp (AbstrTipp t);        //kas sai lisada?
   boolean   eemaldaTipp (AbstrTipp t);     //kas sai eemaldada?
   AbstrTipp leiaTipp (String nimi);        //nime jargi tipu leidmine
   String    toString ();                   //va"ljatru"kiks vajalik
} 

interface AbstrTipp {
   String  votaNimi ();                     //tipu nime leidmine
   boolean lisaValjuvkaar (AbstrKaar k);    //kas sai lisada?
   boolean eemaldaValjuvkaar (AbstrKaar k); //kas sai eemaldada?
}

interface AbstrKaar {
   boolean paneSuubuma (AbstrTipp t);
   String  votaNimi ();                     //kaare nime leidmine
}

//===========================================================
// Lihtahela klass
//===========================================================

class Element { //lisainfo tuleb lisada alamklassides

   String  nimi;
   Element jargmine;

   Element() {           //konstruktor vaikimisi
   }

   Element (String s) {  //konstruktor nimega isendite loomiseks
      paneNimi (s);
   }

   public String votaNimi() {
      return nimi;
   }

   public Element votaJargmine() {
      return jargmine;
   }

   public void paneNimi (String s) {
      nimi = s;
   }

   public void paneJargmine (Element e) {
      jargmine = e;
   }

   public Element lisa (Element e) { //annab uue alguse tagasi
      if (e == null) return this; // ei olnudki soovi lisada
      if (e == this) return this; // ebanormaalne situatsioon niikuinii
      if (e.votaNimi().compareTo (votaNimi()) < 0) { // e.nimi < this.nimi
         e.paneJargmine (this); // lisamine ahela algusesse
         return e;
      }
      Element abi = this; // hakkame kohta otsima abi jarele
      while (abi.votaJargmine() != null) {
         if (e.votaNimi().compareTo (abi.votaJargmine().votaNimi()) < 0) {
            // lisamine abi jarele
            e.paneJargmine (abi.votaJargmine());
            abi.paneJargmine (e);
            return this;
         }
         abi = abi.votaJargmine();
      }
      abi.paneJargmine (e); // lisamine ahela loppu
      e.paneJargmine (null); // igaks juhuks
      return this;
   } // lisa() lopp

   public Element eemalda (Element e) {     //annab uue alguse voi null
      if (e == null) return this;           //ei eemalda midagi
      if (e == this) return votaJargmine(); //esimese eemaldamine
      Element abi = this;
      while (abi != null) {
         if (e == abi.votaJargmine()) {
            abi.paneJargmine (e.votaJargmine());
         }
         abi = abi.votaJargmine();
      }
      return this;
   }

   public Element otsi (String s) {  //kui ei leia, siis null
      Element abi = this;
      while (abi != null) {
         if (s.equals (abi.votaNimi())) return abi;
         abi = abi.votaJargmine();
      }
      return null;
   }

} //jpoial.Element lopp
  
//================================================================
// jpoial.Graaf on tippude ahel, mis realiseerib jpoial.AbstrGraaf liidese
//================================================================

class Graaf extends Element implements AbstrGraaf {

   Tipp esimene;

   Graaf () {  //konstruktor vaikimisi
   }

   Graaf (String s) { //konstruktor nimega graafi jaoks
      super(s);
   }

   public Tipp votaEsimene () {
      return esimene;
   }

   public void paneEsimene (Tipp t) {
      esimene = t;
   }

   public boolean lisaTipp (AbstrTipp t) {
      if (votaEsimene() == null) {
         paneEsimene ((Tipp) t); 
         return true;
      }
      paneEsimene ((Tipp) votaEsimene().lisa ((Tipp) t));
      return true;
   }

   public boolean eemaldaTipp (AbstrTipp t) {
      if (votaEsimene() == null) return false;
      paneEsimene ((Tipp) votaEsimene().eemalda ((Tipp) t));
      return true;
   }

   public AbstrTipp leiaTipp (String s) {
      if (votaEsimene() == null) return null;
      return (Tipp) votaEsimene().otsi (s);
   }

   public String toString () {
      String abi = "jpoial.Graaf: " + votaNimi() + "\n";
      Tipp t = votaEsimene();
      while (t != null) {
         abi += t.votaNimi() + " --> ";
         Kaar k = t.votaEsimenevaljuv();
         while (k != null) {
            abi += k.votaKuhusuubub().votaNimi() + " (" + k.votaNimi() + ") ";
            k = (Kaar) k.votaJargmine();
         }
         abi += "\n";
         t = (Tipp) t.votaJargmine();
      }
      return abi;
   }

} //jpoial.Graaf lopp

//========================================================================
// jpoial.Tipp sisaldab va"ljuvate kaarte ahela ja realiseerib jpoial.AbstrTipp liidese
//========================================================================

class Tipp extends Element implements AbstrTipp {

   Kaar esimenevaljuv;

   Tipp () {  //konstruktor vaikimisi
   }

   Tipp (String s) {  //konstruktor nimega tipule
      super (s);
   }

   public Kaar votaEsimenevaljuv () {
      return esimenevaljuv;
   }

   public void paneEsimenevaljuv (Kaar k) {
      esimenevaljuv = k;
   }

   public boolean lisaValjuvkaar (AbstrKaar k) {
      if (votaEsimenevaljuv () == null) {
         paneEsimenevaljuv ((Kaar) k);
         return true;
      }
      paneEsimenevaljuv ((Kaar) votaEsimenevaljuv().lisa ((Kaar) k));
      return true;
   }

   public boolean eemaldaValjuvkaar (AbstrKaar k) {
      if (votaEsimenevaljuv () == null) return false;
      paneEsimenevaljuv ((Kaar) votaEsimenevaljuv().eemalda ((Kaar) k));
      return true;
   }

} //jpoial.Tipp lopp

//================================================================
// jpoial.Kaar sisaldab infot tipu kohta, millesse ta suubub ja
// realiseerib jpoial.AbstrKaar liidese
//================================================================

class Kaar extends Element implements AbstrKaar {

   Tipp kuhusuubub;

   Kaar () {         //konstruktor vaikimisi
   }

   Kaar (String s) { //konstruktor nimega kaarele
      super (s);
   }

   public Tipp votaKuhusuubub () {
      return kuhusuubub;
   }

   public void paneKuhusuubub (Tipp t) {
      kuhusuubub = t;
   }

   public boolean paneSuubuma (AbstrTipp t) {
      paneKuhusuubub ((Tipp) t);
      return t != null;
   }

} //jpoial.Kaar lopp

//===========================================================
// faili lopp
//===========================================================

