package jpoial;

/**
 * Tabeli arvutamine.
 * @author Jaanus Poial
 * @version 0.4
 * @since 1.5
 */
public class SqrtTab {

   /** ridade arv tabelis ilma p&auml;isridadeta */
   final static int RIDADE_ARV = 20;

   /** veergude arv tabelis ilma juhtveeruta */
   final static int VEERGUDE_ARV = 10;

   /** tabeli elemendi tr&uuml;kikuju pikkus ilma vaheta */
   final static int EL_PIKKUS = 6;

   /** Peameetod. Tabeli arvutamine ja v&auml;ljatr&uuml;kk lehtede kaupa.
    * @param k&auml;surealt saab anda tabeli sammu
    */
   public static void main (String[] param) {
      double samm=1;
      if (param.length > 0)
         samm = Double.parseDouble (param[0]);
      for (int i=0; i<5; i++) {
         double[][] t = arvuta (i*RIDADE_ARV*samm, samm);
         tryki (t, i*RIDADE_ARV*samm, samm);
      }
   } // main

   /** 
    * Arvutada ruutjuurte tabel alates etteantud arvust etteantud sammuga.
    * @param algus argumendi algv&auml;&auml;rtus
    * @param samm argumendi muutus j&auml;rgmise rea arvutamiseks
    * @return tabel, milles on RIDADE_ARV rida ning
    *    VEERGUDE_ARV veergu ja mille element on ruutjuur suurusest:
    *    algus + reanumber*samm + veerunumber*samm/VEERGUDE_ARV 
    *    (reanumber ja veerunumber algavad nullist)
    */
   public static double[][] arvuta (double algus, double samm) {
      return null; // TODO!! Siin ongi teie meetod.
   } // arvuta

   /** Tabeli v&auml;ljastamine. Elemendid ei ole &uuml;mardatud vaid murdosa
    * tagumine osa on &auml;ra l&otilde;igatud
    */
   public static void tryki (double[][] tabel, double baas, double samm) {
      if (tabel == null)
         throw new IllegalArgumentException ("Nullobjekt tabeli rollis");
      if (tabel.length == 0)
         throw new IllegalArgumentException ("Tyhi tabel trykkimiseks");
      if (samm<0.01 || samm>10)
         throw new IllegalArgumentException ("Samm olgu l6igust 0.01 kuni 10");
      System.out.println();
      System.out.print ("\t");
      for (int j=0; j<tabel[0].length; j++) {
         System.out.print
             (fString ((double)j*samm/VEERGUDE_ARV, EL_PIKKUS-1) + "  ");
      }
      System.out.println();
      System.out.println(); // tabeli p2ise l6pp
      for (int i=0; i<tabel.length; i++) {
         System.out.print (fString (baas + i*samm, EL_PIKKUS-2) + "\t");
         for (int j=0; j<tabel[i].length; j++) {
            System.out.print (fString (tabel [i][j], EL_PIKKUS) + " ");
         }
         System.out.println();
      }
   } // tryki

   /** Reaalarv etteantud pikkusega stringina. 
    * @param d teisendatav reaalarv
    * @param len tulemuse pikkus
    * @return d trykikuju pikkusega len
    */
   public static String fString (double d, int len) {
      if (len<1) 
         return "";
      // pad on ruum punkti ja v6imaliku miinusm2rgi jaoks
      int pad = 1 + ((d<0)?1:0);
      // loga on t2isosa numbrikohtade arv
      int loga = (int)Math.max (0., Math.log10 (Math.abs (d))) + 1;
      // kk on punkti j2rel olevate kohtade arv
      int kk = (int)Math.max (len-pad-loga, 0);
      String fs = "%" + String.valueOf (len) + "." + 
         String.valueOf (kk) + "f";
      return String.format ((java.util.Locale)null, fs, d);
   } // fString

} // jpoial.SqrtTab

