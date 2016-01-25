package other;/*
 * Fail other.Torud.java
 * author Jaanus Poial
 */

//======================================================================
// Torude tegemine (ingl.k. pipe) 
//======================================================================

import java.io.*;

public class Torud {

   public static void main (String[] parameetrid) {

      try {
         PipedOutputStream kirjutaja = new PipedOutputStream();
         PipedInputStream lugeja = new PipedInputStream();
         Tootja kirjutajaloim = new Tootja (kirjutaja);
         Tarbija lugejaloim = new Tarbija (lugeja);
         kirjutaja.connect (lugeja); // saab teisiti, aga su"mmetria
         kirjutajaloim.start();
         lugejaloim.start();
      }
      catch (IOException e) {
         System.out.println ("S/V viga: " + e);
      }

   } // main lopp

} // other.Torud lopp

//======================================================================

class Tootja extends Thread {

   PipedOutputStream voog;

   Tootja (PipedOutputStream p) {
      voog = p;
   }

   public void run() {
      System.out.println ("other.Tootja alustas... ");
      try {
         for (int i = 0; i < 9; i++) {
            int r = (int)(Math.random()*256);
            voog.write (r); // toode toodetud
            System.out.println (i + ". toodetud: " + r);
            try {
               sleep ((int)(Math.random()*1000));
            } catch (InterruptedException e) {}
         }
         voog.close(); // lugeja saab edasi lugeda
      }
      catch (IOException e) {
         System.out.println ("S/V viga: " + e);
      }
      System.out.println ("other.Tootja lopetas");
   }

} // other.Tootja lopp

//=================================================================

class Tarbija extends Thread {

   PipedInputStream voog;

   Tarbija (PipedInputStream p) {
      voog = p;
   }

   public void run() {
      System.out.println ("other.Tarbija alustas... ");
      try {
         int i = 0;
         int r = -1;
         while ((r = voog.read()) != -1) {
            System.out.println (i++ + ". tarbitud: " + r);
            try {
               sleep ((int)(Math.random()*1000));
            } catch (InterruptedException e) {}
         }
         voog.close(); // lugeja paneb lo~plikult kinni
      }
      catch (IOException e) {
         System.out.println ("S/V viga: " + e);
      }
      System.out.println ("other.Tarbija lopetas");
   }

} // other.Tarbija lopp

