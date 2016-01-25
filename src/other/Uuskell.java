package other;// <pre>
// -------------------------------------------------------------------------------------------
// file: other.Uuskell.java

import java.applet.Applet;   // meie kell on vormilt rakend
import java.awt.*;
import java.awt.event.*;
import java.util.Date;       // meie kell kasutab Date va"ljundit

/** lo'imena realiseeritud kell. */

public class Uuskell extends Applet implements Runnable {

   /** kell sisaldab lo'ime. */
   private Thread loim = null;

   /** kella yhe tiksu pikkus millisekundites. */
   int tiks = 1000;

   /** kas on peatatud. */
   private boolean tsuspended; 

   /** realiseerime liidese Runnable. */
   public void run() {
      while (true) {
         try {
            Thread.sleep (tiks); //magamisaeg on millisekundites
            synchronized (this) {
               while (tsuspended) {
                  wait();
               }
            }
         }
         catch (InterruptedException e) {
         }
         repaint(); // kella seisu va"rskendamine
      }
   } // run

   /** ylekatmine, et teksti ekraanile saada. */
   public void paint (Graphics ekraan) { // Container meetod
      ekraan.drawString (new Date().toString(), 50, 25);
      // jooksev aeg stringina va"ljastatakse antud kohta
   } // paint

   /** rakendi init */
   public void init() {
      if (loim == null) {
         loim = new Thread (this);
         loim.start();
      }
   } // init

   /** see on rakendi meetod. */
   public synchronized void start() {
      tsuspended = false;
      notifyAll();
   } // start

   /** see on rakendi meetod. */
   public synchronized void stop() {
      tsuspended = true;
      notifyAll();
   } // stop

   /** see on rakendi meetod. */
   public void destroy() {
      if (loim != null) {
         loim.interrupt();      // Thread-klass
         loim = null;      // kuulutame surnuks
      } //else ongi surnud
   } // destroy


   /** Applet appears to be Serializable */
   private static final long serialVersionUID = 50L;

   /** peameetod. */
   public static void main (String[] param) {
   // saame ka ka"surealt ka"ivitada
      Frame raam = new Frame ("Minu tehtud kell");
      raam.setSize (350,80);
      Uuskell minuUuskell = new Uuskell();
      raam.add (minuUuskell);
      raam.setVisible (true); // kell ekraanile
      minuUuskell.init();
      minuUuskell.start();
      raam.addWindowListener (new WindowAdapter () {
         public void windowClosing (WindowEvent e) {
            ((Uuskell)((Frame)e.getWindow()).getComponent (0)).stop();
            ((Uuskell)((Frame)e.getWindow()).getComponent (0)).destroy();
            ((Frame)e.getWindow()).dispose();
         }
      } );
   } // main

} // other.Uuskell

// end of file
// -----------------------------------------------------------------------------------------
// </pre>

