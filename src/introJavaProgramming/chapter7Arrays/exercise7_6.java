package introJavaProgramming.chapter7Arrays;

import java.util.Arrays;

/**
 * Created by esta on 25/01/16.
 */
public class exercise7_6 {

    public static void main(String[] args) {
        int[] randomNumbers = new int[20];

        for (int i = 0; i < 20; i++) {
            randomNumbers[i] = 0 + (int)(Math.random() * ((9 - 0) + 1));
        }

        Arrays.sort(randomNumbers);

        System.out.println(Arrays.toString(randomNumbers));

        int[] count = new int[10];

        for (int i : randomNumbers) {
            count[i]++;
        }

        System.out.println(Arrays.toString(count));


    }

}
