package introJavaProgramming.chapter2ElementaryProgramming;

import java.util.Scanner;

public class Exercise_2_5 {
    public static void main(String[] args){

        System.out.println("Enter the subtotal and the gratuity rate.");

        Scanner input = new Scanner(System.in);

        double subtotal = input.nextDouble();
        double rate = input.nextDouble();

        double gratuity = subtotal * rate / 100;
        double sum = gratuity + subtotal;

        System.out.println("The gratuity is " + gratuity + "$ and the total is " + sum + "$.");
    }
}
