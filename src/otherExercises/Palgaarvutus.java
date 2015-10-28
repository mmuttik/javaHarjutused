package otherExercises;

/**
 * Created by kasutaja on 17.10.2015.
 */
public class Palgaarvutus {
    public static void main(String[] args) {
        double raha;
        double alg     = 1000;
        double intress = .03;

        for (int year = 1; year <= 10; year++) {
            raha = alg * Math.pow(1 + intress, year);
            System.out.println(year + " / " + raha);
        }
    }
}
