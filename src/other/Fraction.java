package other;

import java.util.*;

/** This class presents fractions of form n/d where n and d are integer 
 * numbers. Basic operations and arithmetics for fractions are provided.
 * @author Jaanus Poial
 * @version 2.0
 */
public class Fraction implements Comparable<Fraction> {

   /** Main method. Different tests. */
   public static void main (String[] param) {
      Fraction x = new Fraction (-8, 15);
      Fraction y = new Fraction (5, -6);
      Fraction z = null;
      try {
         z = (Fraction)x.clone();
      } catch (CloneNotSupportedException e) {};
      Fraction t = new Fraction (16, -30);
      System.out.println (x + " times " + y + " is " + x.times (y));
      System.out.println (x + " plus " + y + " is " + x.plus (y));
      System.out.println (x + " minus " + y + " is " + x.minus (y));
      System.out.println (x + " divideBy " + y + " is " + x.divideBy (y));
      System.out.println (x + " compareTo " + y + " is " + x.compareTo (y));
      System.out.println (x.inverse() + " integer part is " 
         + x.inverse().integerPart());
      System.out.println (x.inverse() + " fraction part is "
         + x.inverse().fractionPart());
      System.out.println (x + " is approximately " + 
         String.valueOf (x.toDouble()));
      System.out.println (Math.PI + " is approximately " + 
         Fraction.toFraction (Math.PI, 7)
         + " or " + Fraction.toFraction (Math.PI, 7).toDouble());
      Fraction ff = Fraction.valueOf ("-4/7");
      System.out.println (ff);
      System.out.println ("hashCode of x: " + x.hashCode());
      System.out.println ("hashCode of y: " + y.hashCode());
      System.out.println ("hashCode of z: " + z.hashCode());
      System.out.println ("hashCode of t: " + t.hashCode());
   }

   /** numerator */
   private int numerator = 0;

   /** denominator > 0 */
   private int denominator = 1;

   /** Constructor.
    * @param a numerator
    * @param b denominator > 0
    */
   public Fraction (int a, int b) {
      if (b > 0) {
         numerator = a;
         denominator = b;
      } else if (b < 0) {
         numerator = -a;
         denominator = -b;
      } else 
         throw new ArithmeticException (" illegal denominator zero ");
   }

   /** Default constructor returns 0/1.
    */
   Fraction () {
      this (0, 1);
   }

   /** Public method to access the numerator field. 
    * @return numerator
    */
   public int getNumerator() {
      return numerator; 
   }

   /** Public method to access the denominator field. 
    * @return denominator
    */
   public int getDenominator() { 
      return denominator; 
   }

   /** Greatest common divisor of two given integers.
    * @param a first integer
    * @param b second integer
    * @return GCD(a,b)
    */
   private static int gcd (int a, int b) {
      int m = Math.max (Math.abs (a), Math.abs (b));
      if (m == 0) throw new ArithmeticException (" zero in gcd ");
      int n = Math.min (Math.abs (a), Math.abs (b));
      while (n > 0) {
         a = m % n;
         m = n;
         n = a;
      }
      return m;
   }

   /** Reduce this fraction (and make denominator > 0).
    * @return reduced fraction
    */
   private Fraction reduce() {
      Fraction f = null;
      try {
         f = (Fraction)clone();
      } catch (CloneNotSupportedException e) {};
      if (denominator == 0)
         throw new ArithmeticException (" illegal denominator zero ");
      if (denominator < 0) {
         f.numerator = -numerator;
         f.denominator = -denominator;
      }
      if (numerator == 0)
         f.denominator = 1;
      else {
         int n = gcd (numerator, denominator);
         f.numerator = numerator / n;
         f.denominator = denominator / n;
      }
      return f;
   }

   /** Conversion to string.
    * @return string representation of the fraction
    */
   @Override
   public String toString() {
      return String.valueOf (getNumerator()) + "/" 
         + String.valueOf (getDenominator());
   }

   /** Equality test.
    * @param m second fraction
    * @return true if fractions this and m are equal
    */
   @Override
   public boolean equals (Object m) {
      return (this.compareTo ((Fraction)m) == 0);
   }

   /** Hashcode has to be equal for equal fractions.
    * @return hashcode
    */
   @Override
   public int hashCode() {
      return (int) (Double.doubleToLongBits (toDouble())>>31);
   }

   /** Sum of fractions.
    * @param m second addend
    * @return this+m
    */
   public Fraction plus (Fraction m) {
      return new Fraction (numerator*m.denominator + denominator*m.numerator,
         denominator*m.denominator).reduce();
   }

   /** Multiplication of fractions.
    * @param m second factor
    * @return this*m
    */
   public Fraction times (Fraction m) {
      return new Fraction (numerator*m.numerator, denominator*m.denominator)
         .reduce();
   }

   /** Inverse of the fraction. n/d becomes d/n.
    * @return inverse of this fraction: 1/this
    */
   public Fraction inverse() {
      return new Fraction (denominator, numerator).reduce();
   }

   /** Opposite of the fraction. n/d becomes -n/d.
    * @return opposite of this fraction: -this
    */
   public Fraction opposite() {
      return new Fraction (-numerator, denominator).reduce();
   }

   /** Difference of fractions.
    * @param m subtrahend
    * @return this-m
    */
   public Fraction minus (Fraction m) {
      return this.plus (m.opposite());
   }

   /** Quotient of fractions.
    * @param m divisor
    * @return this/m
    */
   public Fraction divideBy (Fraction m) {
      return this.times (m.inverse());
   }

   /** Comparision of fractions.
    * @param m second fraction
    * @return -1 if this < m; 0 if this==m; 1 if this > m
    */
   public int compareTo (Fraction m) {
      if (m instanceof Fraction) {
         Fraction difference = this.minus (m).reduce();
         if (difference.numerator == 0)
            return 0;
         else if (difference.numerator > 0)
            return 1;
         else return -1;
      } else throw new ClassCastException ("cannot cast to other.Fraction");
   }

   /** Clone of the fraction.
    * @return new fraction equal to this
    */
   @Override
   public Object clone() throws CloneNotSupportedException {
      return new Fraction (getNumerator(), getDenominator());
   }

   /** Integer part of the (improper) fraction. 
    * @return integer part of this fraction
    */
   public int integerPart() {
      Fraction tmp = reduce();
      return tmp.getNumerator()/tmp.getDenominator();
   }

   /** Extract fraction part of the (improper) fraction
    * (a proper fraction without the integer part).
    * @return fraction part of this fraction
    */
   public Fraction fractionPart() {
      return new Fraction (numerator - denominator*integerPart(), denominator)
         .reduce();
   }

   /** Approximate value of the fraction.
    * @return numeric value of this fraction
    */
   public double toDouble() {
      return ((double)numerator) / ((double)denominator);
   }

   /** Double value f presented as a fraction with denominator d > 0.
    * @param f real number
    * @param d positive denominator for the result
    * @return f as an approximate fraction of form n/d
    */
   public static Fraction toFraction (double f, int d) {
      if (d > 0)
         return new Fraction ((int)(Math.round (f*d)), d);
      else
         throw new ArithmeticException (" illegal denominator ");
   }

   /** Conversion from string to the fraction. Accepts strings of form
    * that is defined by the toString method.
    * @param s string form (as produced by toString) of the fraction
    * @return fraction represented by s
    */
   public static Fraction valueOf (String s) {
      StringTokenizer st = new StringTokenizer (s, "/<>[](),");
      int num = 0;
      int den = 1;
      if (st.hasMoreTokens()) {
         num = Integer.parseInt (st.nextToken().trim());
      } else {
         throw new IllegalArgumentException ("not fraction " + s);
      }
      if (st.hasMoreTokens()) {
         den = Integer.parseInt (st.nextToken());
      } else {
         // throw new IllegalArgumentException ("not fraction " + s);
         den = 1;
      }
      if (st.hasMoreTokens()) {
         throw new IllegalArgumentException ("not fraction " + s);
      }
      return new Fraction (num, den);
   }

}

