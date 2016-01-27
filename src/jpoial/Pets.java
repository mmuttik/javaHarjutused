package jpoial;

/**
 * Overriding example.
 * @author Jaanus Poial
 * @since 1.5
 * @version 0.2
 */
public class Pets { 

   /** Main method. */
   static public void main (String[] args) {
      System.out.println ("What do pets say?");
      Pet myPet = new Pet ("Betty");
      System.out.println (myPet);    // toString() called from println
      Cat myCat = new Cat ("Garfield");
      System.out.println (myCat);
      myPet = myCat;
      System.out.println (myPet);  // try to guess the result
      Dog myDog = new Dog ("Sam");
      System.out.println (myDog);
   } //main

} //jpoial.Pets


/** General jpoial.Pet class. */
class Pet {

   /** pets name */
   private String name;

   /** constructor */
   Pet (String s) {
      setName (s);
   }

   /** getter */
   public String getName() {
      return name;
   }

   /** setter */
   public void setName (String s) {
      name = s;
   }

   /** Conversion to string. */
   @Override
   public String toString() { //overriding
      return "I am your pet and my name is " + getName();
   }

} //jpoial.Pet


/** Subclass of jpoial.Pet. */
class Cat extends Pet { 

   /** jpoial.Cat is registered at cats register */
   private String catRegNo = "";

   /** constructor */
   Cat (String s) {
      super (s);
   }

   /** Specific conversion to string for cats only. */
   @Override
   public String toString() { //override overridden method once more
      return "I am your CAT " + getName();
   }

} //jpoial.Cat


/** Another subclass of jpoial.Pet. */
class Dog extends Pet {

   /** mother */
   private Dog mother;

   /** father */
   private Dog father;

   /** constructor */
   Dog (String s) {
      super (s);
      mother = null; // jpoial.Dog-specific actions AFTER superclass constructor
      father = null;
   }

} //jpoial.Dog

