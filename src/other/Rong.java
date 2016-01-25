package other;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 * other.Rakend.
 * @since 1.2
 */
public class Rong extends Applet {

   /** Rakendi initsialiseerimine (yks kord alguses).  */
   public void init() {
   } // init

   /** Tegelik joonistamine.  */
   public void paint (Graphics g) {
      // akna m66tmed
      int laius = getWidth()-1;
      int korgus = getHeight()-1;
      int n = 5;
      int vlaius = laius/n;
      int vkorgus = korgus/3;
      for (int i=0; i < n; i++) {
         joonistaVagun (g, i*vlaius, korgus/2, vlaius-5, vkorgus);
      } // for i
   } // paint

   public static void joonistaVagun (Graphics gg, int x, int y,
                              int laius, int korgus) {
      gg.fillRect (x, y, laius, korgus);
   } // joonistaVagun
// ---------------------------------------------------------------------------
// siit allapoole j22vat osa ei pea muutma (kui ehk ainult raami suurust)
// ---------------------------------------------------------------------------

   /** Peameetod rakenduse jaoks, mis omakorda ka"ivitab rakendi.  */
   public static void main (String[] parameetrid) {
      Frame raam = new Frame ("other.Rakend raamis");
      Rong rakend = new Rong();
      raam.setSize (208, 225);
      raam.add (rakend);
      raam.setVisible (true);
      rakend.init();
      rakend.start();
      raam.addWindowListener (new WindowAdapter() {
         public void windowClosing (WindowEvent e) {
            ((Rong)((Frame)e.getWindow()).getComponent (0)).stop();
            ((Rong)((Frame)e.getWindow()).getComponent (0)).destroy();
            ((Frame)e.getWindow()).dispose();
         }
      } );
   } // main

} // other.Rong

