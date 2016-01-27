package jpoial;

public class Threads {

   public static void main (String[] args) {
      MyThread t1 = new MyThread("1");
      MyThread t2 = new MyThread ("2");
      t1.start();
      t2.start();
   } // main

} // jpoial.Threads

class MyThread extends Thread {

   String name;

   MyThread (String s) {
      name = s;
   } // constructor

   public void run() {
      for (int i=0; i<500; i++) {
         try {
            sleep(20);
         }
         catch (InterruptedException e) {}
         System.out.print (name);
      } // for
   } // run

} // jpoial.MyThread

