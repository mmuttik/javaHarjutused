package other;// file: other.Clock.java

import java.applet.Applet;   // our clock will be an applet
import java.awt.*;
import java.awt.event.*;
import java.util.Date;       // new Date() is used to return the current time

/** Thread and Applet put together.
 * @author Jaanus Poial
 * @version 0.3
 * @since 1.2
 */
public class Clock extends Applet implements Runnable {

   /** clock thread */
   private Thread thread = null;

   /** one tick in milliseconds */
   int tick = 1000;

   /** is the clock suspended? */
   private boolean suspended; 

   /** our clock has to implement the Runnable interface */
   public void run() {
      while (true) { // run forever
         try {
            Thread.sleep (tick); // sleep time is in milliseconds
            synchronized (this) {
               while (suspended) {
                  wait();
               }
            } // end of critical section
         }
         catch (InterruptedException e) {
            return;
         }
         repaint(); // renew the clock state
      }
   } // run

   /** screen drawing to output the result */
   public void paint (Graphics screen) {
      screen.drawString (new Date().toString(), 50, 25);
   } // paint

   /** Applet init */
   public void init() {
      if (thread == null) {
         thread = new Thread (this);
         thread.start();
      }
   } // init

   /** Applet start */
   public synchronized void start() {
      suspended = false;
      notifyAll();
   } // start

   /** Applet stop */
   public synchronized void stop() {
      suspended = true;
      notifyAll();
   } // stop

   /** Applet destroy, hardly ever called */
   public void destroy() {
      if (thread != null) {
         thread.interrupt();
         thread = null;
      }
   } // destroy

// ------------------ end of important part -----------------------------


   /** Applet appears to be Serializable */
   private static final long serialVersionUID = -8564370944529496313L;

   /** other.Clock can be used also as an application */
   public static void main (String[] param) {
      Frame myFrame = new Frame ("Frame clock");
      myFrame.setSize (400,80);
      Clock myClock = new Clock(); // Runnable Applet
      myFrame.add (myClock);
      myFrame.setVisible (true);
      myClock.init();
      myClock.start();
      myFrame.addWindowListener (new WindowAdapter () {
         public void windowClosing (WindowEvent e) {
            ((Clock)((Frame)e.getWindow()).getComponent (0)).stop();
            ((Clock)((Frame)e.getWindow()).getComponent (0)).destroy();
            System.exit (0);
         }
      } );
   } // main

} // other.Clock

// end of file

