package jpoial;// file: jpoial.PersonMain.java

import java.util.Calendar;

public class PersonMain {

   public static void main (String[] args) {
      Calendar bd1 = Calendar.getInstance();
      bd1.set (1959, 04, 30);
      Person p1 = new Person ("Smith", "John", bd1);
      System.out.println (p1);
      Person p2 = new Person ();
      System.out.println (p2);
   } // main

} // jpoial.PersonMain

class Person {
   String surname;
   String firstName;
   Calendar birthDate;

   Person() {
      this ("DEFAULT_SURNAME", "DEFAULT_FIRSTNAME", Calendar.getInstance());
   } // default constructor

   Person (String sn, String fn, Calendar bd) {
      surname = sn;
      firstName = fn;
      birthDate = bd;
   } // constructor

   public String toString() {
      return (firstName + " " + surname + " " 
         + String.valueOf (birthDate.get (Calendar.YEAR)) + " "
         + String.valueOf (birthDate.get (Calendar.MONTH)) + " "
         + String.valueOf (birthDate.get (Calendar.DAY_OF_MONTH)));
   } // toString

} // jpoial.Person

// end of file

