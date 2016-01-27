package other.introJavaProgramming.chapter6Methods;

/**
 * Created by esta on 26/11/15.
 */
public class Exercise_listing_6_4 {
    public static void main(String[] args) {
        int x = 1;

        System.out.println("Before the call, x is " + x);
        increment(x);
        System.out.println("After the call, x is " + x);
    }

    public static void increment(int n) {
        n++;
        System.out.println("n inside the method is " + n);
    }
}
