package kt_d.kontrolltööNew;

/**
 * Created by X1 on 8.01.2016.
 */
public class Replace_All_Tsyklita {
    public static void main(String[] args) {
        System.out.println(asenda("Asenda koik tahed margiga #"));
    }

    private static String asenda(String s) {
        return s.replaceAll("[A-z]", "#");
    }
}
