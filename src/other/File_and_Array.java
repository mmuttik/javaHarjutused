package other;// file: other.File_and_Array.java

import java.io.*;
import java.util.StringTokenizer;

/** Read and write for the array of double numbers. 
 * @author Jaanus Poial
 * @version 0.3
 * @since 1.2
 */
public class File_and_Array {

   /** Main method.
    * @param argum input_file_name  output_file_name
    */
   public static void main (String[] argum) {
      String fname = "input.txt";
      if (argum.length > 0)
         fname = argum[0];
      String oname = "output.txt";
      if (argum.length > 1)
         oname = argum[1];
      double[][] array;
      array = readArray (fname); 
      if (array == null)
         return;
      System.out.println (fname + " contains:");
      for (int i=0; i<array.length; i++) {
         for (int j=0; j<array[i].length; j++) {
            System.out.print (String.valueOf (array[i][j]) + " ");
         }
         System.out.println();
      }
      writeArray (array, oname);
      System.out.println ("Result is in file " + oname);
   } // main

   /** Read a matrix from the text file. 
    * other.First line of the file: number_of_rows  number_of_columns
    * @param f input file name
    */
   public static double[][] readArray (String f) {
      int m = 0; // number of rows
      int n = 0; // number of columns
      double[][] result = null;
      int i = -1;
      String line = null;
      try {
         BufferedReader input = new BufferedReader (new FileReader (f));

         // fetch m and n from the first line
         if ((line = input.readLine()) != null) {
            StringTokenizer st0 = new StringTokenizer (line);
            if (st0.countTokens()<2) {
               throw new IOException ("Illegal first line in " + f);
            }
            m = Integer.parseInt (st0.nextToken());
            n = Integer.parseInt (st0.nextToken());
         } else {
            throw new IOException ("Empty file " + f);
         }

         // read the matrix
         result = new double [m][n];
         i = 0; // row number
         while (((line = input.readLine()) != null) && (i<m)) {
            StringTokenizer st = new StringTokenizer (line);
            int j = 0; // column number
            while ((st.hasMoreTokens()) && (j<n)) {
               result [i][j] = Double.parseDouble (st.nextToken());
               j++;
            }
            i++;
         }
         input.close();
      }
      catch (NumberFormatException e) {
         System.out.println ("\nFile " + f + " line nr " + String.valueOf (i+2)
            + " is illegal:\n" + line + "\n" + e);
      }
      catch (IOException e) {
         System.out.println ("Input/output error: " + e);
      }
      return result;
   } // readArray

   /** Write an array of double values into the text file. 
    * other.First line of the file: number_of_rows  number_of_columns
    * @param d array to output
    * @param f output file name
    */
   public static void writeArray (double[][] d, String f) {
      int m = d.length;  // number of rows
      int n = 0;         // number of columns
      for (int i=0; i<m; i++)
         if (d[i].length > n)
            n = d[i].length;

      try {
         PrintWriter output = new PrintWriter (new FileWriter (f), true);
         output.print (String.valueOf (m) + " ");
         output.println (String.valueOf (n));
         for (int i=0; i<d.length; i++) {
            for (int j=0; j<d[i].length; j++) {
               output.print (String.valueOf (d[i][j]) + " ");
            }
            output.println();
         }
         output.close();
      }
      catch (IOException e) {
         System.out.println ("Input/output error: " + e);
      }
      return;
   } // writeArray

} // other.File_and_Array

// end of file

