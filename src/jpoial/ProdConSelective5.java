package jpoial;// file: jpoial.ProdConSelective5.java

import java.util.*;

/** jpoial.Producer-jpoial.Consumer demo.
 * @author Jaanus Poial
 * @version 0.6
 * @since 1.5
 */
public class ProdConSelective5 {

   /** buffer capacity */
   public static final int BUFLEN = 6;

   /** shared buffer */
   public static ArrayList<String> buf = new ArrayList<String>(BUFLEN);

   /** Main method */
   public static void main (String[] param) {
      int producer1_tick  = 5000; //millisec
      int producer2_tick  = 2000; //millisec
      int consumer1_tick  = 3000; //millisec
      int consumer2_tick  = 1000; //millisec
      System.out.println ("Buffer capacity: " + BUFLEN);
      new Producer (producer1_tick,  "Pro1");
      new Producer (producer2_tick,  "Pro2");
      new Consumer (consumer1_tick, "Con1");
      new SelectiveConsumer (consumer2_tick, "Con2");
   } // main

} // jpoial.ProdConSelective5


/** jpoial.Producer. */
class Producer implements Runnable {

   /** producing thread */
   Thread pthread;

   /** time to produce an item in milliseconds */
   int tick;

   /** producer label */
   String name;

   /** producer thread constructor */
   Producer (int i, String s) {
      pthread = new Thread (this); // "this" is Runnable
      tick = i;
      name = s;
      pthread.start();
   }

   /** producer thread content */
   public void run() {
      try {
         while (true) { // infinite loop
            produce();  // produce an item after each tick
            Thread.sleep (tick);
         }
      }
      catch (InterruptedException e) {
      }
   } // run

   /** producing process */
   public void produce() throws InterruptedException {
         synchronized (ProdConSelective5.buf) {
            while (ProdConSelective5.buf.size() >= ProdConSelective5.BUFLEN) {
               ProdConSelective5.buf.wait(); // buffer is full, wait
            }
            ProdConSelective5.buf.add ("(" + name + " > " +
               new Date().toString() + ")"); // timestamp
            System.out.println (name + " > " + 
               ProdConSelective5.buf.get (ProdConSelective5.buf.size()-1) +
               " " + tick + " " + ProdConSelective5.buf.size());
            ProdConSelective5.buf.notifyAll();
         } // end of critical section
   } // produce

} // jpoial.Producer


/** jpoial.Consumer. */
class Consumer implements Runnable {

   /** consumer thread */
   Thread cthread;
   
   /** time to consume an item in milliseconds */
   int tick;

   /** consumer label */
   String name;

   /** consumer thread constructor */
   Consumer (int i, String s) {
      cthread = new Thread (this); // "this" is Runnable
      tick = i;
      name = s;
      cthread.start();
   }

   /** consumer thread content */
   public void run() {
      try {
         while (true) { // infinite loop
            consume();  // consume an item after each tick
            Thread.sleep (tick);
         }
      }
      catch (InterruptedException e) {
      }
   } // run

   /** consume an item */
   public void consume() throws InterruptedException {
         synchronized (ProdConSelective5.buf) {
            while (ProdConSelective5.buf.size() <= 0) {
               ProdConSelective5.buf.wait(); // buffer is empty, wait
            }
            String message = (String)ProdConSelective5.buf.get (0);
            System.out.println (name + " < " +
               message + " " + tick);
            ProdConSelective5.buf.remove (0);
            ProdConSelective5.buf.notifyAll();
         } // end of critical section
   } // consume

} // jpoial.Consumer


/** Selective consumer, never uses "Pro2" labelled products. */
class SelectiveConsumer extends Consumer {

   /** selective consumer thread constructor */
   SelectiveConsumer (int i, String s) {
      super (i, s);
   }

   /**check and consume an item */
   public void consume() throws InterruptedException {
         synchronized (ProdConSelective5.buf) {
            while (ProdConSelective5.buf.size() <= 0) {
               ProdConSelective5.buf.wait(); // buffer is empty, wait
            }
            String message = (String)ProdConSelective5.buf.get (0);
            if (message.startsWith ("(Pro2")) {
               System.out.println ("I do not use " + message);
               ProdConSelective5.buf.wait();
            } else {
               System.out.println (name + " < " +
                  message + " " + tick);
               ProdConSelective5.buf.remove (0);
               ProdConSelective5.buf.notifyAll();
            }
         } // end of critical section
   } // consume

} // jpoial.SelectiveConsumer

// end of file

