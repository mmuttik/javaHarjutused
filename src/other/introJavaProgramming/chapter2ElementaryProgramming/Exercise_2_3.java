package other.introJavaProgramming.chapter2ElementaryProgramming;

import java.util.Scanner;

public class Exercise_2_3 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value for meter.");

        double meter = input.nextDouble();

        double feet = meter * 3.2786;

        System.out.println(meter + " is " + feet + " feet");

    }
}
