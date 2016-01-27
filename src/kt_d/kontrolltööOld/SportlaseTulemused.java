package kt_d.kontrolltööOld;

/**
 * Sportlase punktisumma arvutatakse üksikkatsetest saadud punktide summana, millest maha võetud kahe halvima katse tulemused
 * (üksikkatseid rohkem, kui 2). Kirjutada Java meetod, mis arvutab punktisumma üksikkatsete tulemuste massiivi põhjal. Parameetriks olevat
 * massiivi muuta ei tohi.
 */
public class SportlaseTulemused {
    public static void main(String[] args) {
        System.out.println(score(new int[]{4, 1, 2, 3, 0}));
    }

    private static int score(int[] points) {
        int vastus = 0, min1 = points[0], min2 = points[1], temp = 0;
        for (int x = 0; x < points.length; x++) {
            if (min1 > points[x]) {
                min1 = points[x];
                temp = x;
            }
        }
        for (int y = 0; y < points.length; y++) {
            min2 = points[y];
        }
        for (int y = 0; y < points.length; y++) {
            vastus = points[y] + vastus;
        }
        vastus = vastus - min1 - min2;
        return vastus;

        /*Teine variant -aga massiiv muutub

        Arrays.sort(points);
        int summa = 0;
        for (int i = 2; i < points.length; i++) {
            summa += points[i];

        } return summa;*/

    }
}






