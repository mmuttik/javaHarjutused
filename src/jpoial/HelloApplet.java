package jpoial;/*
 * Fail jpoial.HelloApplet.java
 */

//================================================
//   jpoial.Lihtne rakend, mida saab panna veebilehele
//================================================

import java.applet.Applet;
import java.awt.Graphics;

public class HelloApplet extends Applet {

   public void paint(Graphics ekraan) {        //ylekaetud meetod
      ekraan.drawString("Tere, veeb!",50,25);
   }

   private static final long serialVersionUID = -8564370944529496313L;
   
} // jpoial.HelloApplet lopp

