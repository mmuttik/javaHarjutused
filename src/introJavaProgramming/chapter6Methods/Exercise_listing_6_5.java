package introJavaProgramming.chapter6Methods;

/**
 * Created by esta on 26/11/15.
 */
public class Exercise_listing_6_5 {
    public static void main(String[] args) {

        //Declare and initialize variables
        int num1 = 1;
        int num2 = 2;

        System.out.println("Before invoking the swap method, variable num1 is " + num1 + " and variable num2 is " + num2);

        //Invoke the swap method

        swap(num1, num2);

        System.out.println("After invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
    }

    private static void swap(int n1, int n2) {
        System.out.println("\tInside the swap method");
        System.out.println("\tBefore swapping num1 = " + n1 + " and num2 = " + n2);

        //Swap

        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("\t\tAfter swapping, n1 is " + n1 + " and n2 is " + n2);
    }
}
