package introJavaProgramming.chapter2ElementaryProgramming;

import java.util.Scanner;

public class Exercise_2_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter square meters.");

        double meters = input.nextDouble();

        double ping = meters * 0.3025;

        System.out.println(meters + " square meters is " + ping + " ping.");

    }
}
