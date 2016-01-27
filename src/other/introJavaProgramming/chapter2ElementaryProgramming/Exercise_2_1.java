package other.introJavaProgramming.chapter2ElementaryProgramming;

import java.util.Scanner;

public class Exercise_2_1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter miles.");

        double miles = input.nextDouble();

        double km = miles * 1.6;

        System.out.println(miles + " miles is " + km + " kilometers.");

    }


}
