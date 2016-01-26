package introJavaProgramming.chapter2ElementaryProgramming;

import java.util.Scanner;

public class Exercise_2_2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the sides and height of an equilateral triangle.");

        double sideTriangle = input.nextDouble();
        double height = input.nextDouble();

        double area = (Math.pow(3, 0.5)) / 4 * sideTriangle * sideTriangle;

        double volume = area * height;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);

    }


}
